import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Publisher {
	public static void main(String args[]) {
		Ice.Communicator ic = null;
		Ice.ObjectPrx base;
		forum.ListenerPrx listenerPrx;
		String str;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {
			ic = Ice.Util.initialize(args);
			base = ic.stringToProxy("AListener:udp -h 239.1.1.1 -p 10000 --ttl 2 --interface 172.17.222.208");
			// tmpPrx=forum.ListenerPrxHelper.uncheckedCast(base);
			base = base.ice_datagram();
			listenerPrx = forum.ListenerPrxHelper.uncheckedCast(base);
			do {
				System.out.print("Somethig to publish: ");
				str = in.readLine();
				if (str.length() > 0)
					listenerPrx.newPublication(str);
			} while (str.length() > 0);
			ic.destroy();
		} catch (Exception e) {
			System.out.println("ERROR : " + e);
			e.printStackTrace(System.out);
		}
	}
}
