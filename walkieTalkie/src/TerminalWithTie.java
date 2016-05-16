import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import walkieTalkie.*;

public class TerminalWithTie {
	public static void main(String args[]) {
		int port;
		Ice.Communicator ic = null;
		Ice.ObjectAdapter adapter;
		EarWithTie myEar;
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		String str;
		Ice.ObjectPrx base;
		Ice.Identity id;
		EarPrx theOtherEnd;
		int option;
		boolean holding = false;

		if (args.length != 4) {
			System.out.println(
					"Invocation error. Correct Syntax: \n\tjava TerminalWithInheritance <myName> <myPort> <counterpart's Name> <counterpart's Port>");
			return;
		}
		myEar = new EarWithTie();
		try {
			port = Integer.valueOf(args[1]);
			ic = Ice.Util.initialize(args);
			adapter = ic.createObjectAdapterWithEndpoints("EarsAdapter", "tcp -h 127.0.0.1 -p " + port + " : udp -h 127.0.0.1 -p " + port);
			id =  ic.stringToIdentity(args[0]);
			adapter.add(new _EarTie(myEar), id);
			adapter.activate();
			
			System.out.print("type Return when my counterpart is ready");
			stdIn.readLine();
			
			port = Integer.valueOf(args[3]);
			base = ic.stringToProxy(args[2] + ":tcp -h 127.0.0.1 -p " + port);
			theOtherEnd = EarPrxHelper.checkedCast(base);
			
			while ((option = menu()) != 0) {
				switch (option) {
				case 1:
					System.out.print("which message: ");
					str = stdIn.readLine();
					theOtherEnd.pushMesssage(str);
					break;
				case 2:
					if (holding)
						adapter.activate();
					else
						adapter.hold();
					holding = !holding;
					break;
				}

			}
			ic.destroy();
		} catch (Exception e) {
			System.out.println("ERROR : " + e);
			e.printStackTrace(System.out);
		}
	}

	static int menu() throws IOException {
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		int option;
		String str;

		System.out.println("Type:");
		System.out.println("\t1: for sending a message");
		System.out.println("\t2: for holding/activating messages");
		System.out.println("\t0: to exit");
		str = stdIn.readLine();
		option = Integer.valueOf(str).intValue();
		return option;
	}
}
