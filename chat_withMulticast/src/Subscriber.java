import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Subscriber {
	public static void main(String args[]) {
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		int status = 0;
		Ice.Communicator ic = null;
		Ice.ObjectAdapter adapter;
		Ice.Identity id;

		try {
			ic = Ice.Util.initialize(args);
			adapter = ic.createObjectAdapterWithEndpoints("ListenerAdapter", "udp -h 239.1.1.1 -p 10000");
			
			Ice.Object object = new Receptor();
			id = ic.stringToIdentity("AListener");
			adapter.add(object, id);
			adapter.activate();
			
			System.out.println("SimpleCalulator server ready .... ");
			System.out.println("To Stop server pulse \"Return\" .... ");
			stdIn.readLine();
			ic.destroy();
		} catch (Ice.LocalException e) {
			e.printStackTrace();
			status = 1;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			status = 1;
		}
		if (ic != null) {
			// Clean up
			try {
				ic.destroy();
			} catch (Exception e) {
				System.err.println(e.getMessage());
				status = 1;
			}
		}
		System.exit(status);
	}
}
