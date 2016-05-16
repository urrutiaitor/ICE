import java.io.BufferedReader;
import java.io.InputStreamReader;
import walkieTalkie.*;

public class TerminalWithInheritance {
	public static void main(String args[]) {
		int port;
		Ice.Communicator ic = null;
		Ice.ObjectAdapter adapter;
		EarWithInheritance myEar;
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		String str;
		Ice.ObjectPrx base;
		EarPrx theOtherEnd;

		if (args.length != 4) {
			System.out.println(
					"Invocation error. Correct Syntax: \n\tjava TerminalWithInheritance <myName> <myPort> <counterpart's Name> <counterpart's Port>");
			return;
		}
		myEar = new EarWithInheritance();
		try {
			port = Integer.valueOf(args[1]);
			ic = Ice.Util.initialize(args);
			adapter = ic.createObjectAdapterWithEndpoints("EarsAdapter", "tcp -h 127.0.0.1 -p " + port + " : udp -h 127.0.0.1 -p " + port);
			adapter.add(myEar, ic.stringToIdentity(args[0]));
			adapter.activate();
			System.out.print("type Return when my counterpart is ready");
			stdIn.readLine();
			port = Integer.valueOf(args[3]);
			// base = ic.stringToProxy(args[2]+":tcp -h 127.0.0.1 -p "+port);
			base = ic.stringToProxy(args[2] + ":udp -h 127.0.0.1 -p " + port);
			theOtherEnd = EarPrxHelper.uncheckedCast(base);
			// theOtherEnd=EarPrxHelper.uncheckedCast(theOtherEnd.ice_oneway());
			theOtherEnd = EarPrxHelper.uncheckedCast(theOtherEnd.ice_datagram());
			System.out.println("This terminal will end when you enter \"Return\"\n");
			do {
				str = stdIn.readLine();
				if (str.length() != 0)
					theOtherEnd.pushMesssage(str);
			} while (str.length() != 0);
			ic.destroy();
		} catch (Exception e) {
			System.out.println("ERROR : " + e);
			e.printStackTrace(System.out);
		}
	}
}
