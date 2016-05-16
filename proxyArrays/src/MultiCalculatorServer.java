import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MultiCalculatorServer {
	public static void main(String args[]) {
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		int status = 0;
		Ice.Communicator ic = null;
		Ice.ObjectAdapter adapter;

		try {
			ic = Ice.Util.initialize(args);
			adapter = ic.createObjectAdapterWithEndpoints("MultiCalculatorAdapter", "tcp -h 127.0.0.1 -p 10000");
			
			new CalculatorManagerI(adapter);
			adapter.activate();
			
			System.out.println("MultiCalulator server ready .... ");
			// ic.waitForShutdown();
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
			// Clean up
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
