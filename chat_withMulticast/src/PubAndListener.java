import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PubAndListener {
	public static void main(String args[]) {
		Ice.Communicator ic = null;
		Ice.ObjectPrx base;
		forum.ListenerPrx tmpPrx, listenerPrx;
		Ice.ObjectAdapter adapter;
		Ice.Identity id;
		String str;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {
			ic = Ice.Util.initialize(args);
			adapter = ic.createObjectAdapterWithEndpoints("ListenerAdapter", "udp -h 239.1.1.1 -p 10000");
			
			Ice.Object object = new Receptor();
			id = ic.stringToIdentity("AListener");
			adapter.add(object, id);
			adapter.activate();
			
			base = ic.stringToProxy("AListener:udp -h 239.1.1.1 -p 10000 --ttl 2 --interface 172.100.100.24");
			tmpPrx = forum.ListenerPrxHelper.uncheckedCast(base);
			
			base = tmpPrx.ice_datagram();
			listenerPrx = forum.ListenerPrxHelper.uncheckedCast(base);
			
			base = listenerPrx.ice_collocationOptimized(false);
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
