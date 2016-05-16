import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ListenerApp {
	public static void main(String args[]) {
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		Ice.ObjectAdapter adapter;
		Ice.Communicator ic = null;
		Ice.Identity id;
		ListenerI listener;

		try {
			ic = Ice.Util.initialize(args);
			adapter = ic.createObjectAdapterWithEndpoints("AnAdapter", "tcp -h 127.0.0.1 -p 10001");
			
			listener = new ListenerI();
			id = ic.stringToIdentity("AListener");
			adapter.add(listener, id);
			adapter.activate();
			
			System.out.println("ChatModerator server ready .... ");
			// ic.waitForShutdown();
			System.out.println("To Stop server pulse \"Return\" .... ");
			stdIn.readLine();
			ic.destroy();

		} catch (Exception e) {
			System.err.println("ERROR: " + e);
			e.printStackTrace(System.out);
		}
	}
}
