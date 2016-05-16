import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ChatServer {
	public static void main(String args[]) {
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		Ice.ObjectAdapter adapter;
		Ice.Communicator ic = null;
		ModeratorI theModerator;

		try {
			ic = Ice.Util.initialize(args);
			adapter = ic.createObjectAdapterWithEndpoints("ChatModeratorAdapter", "tcp -h 127.0.0.1 -p 10000");
			
			theModerator = new ModeratorI();
			adapter.add(theModerator, ic.stringToIdentity("ChatModerator"));
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
