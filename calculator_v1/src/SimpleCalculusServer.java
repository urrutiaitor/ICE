import java.io.*;

public class SimpleCalculusServer {
	public static void main(String args[]) {
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		Ice.Communicator ic = null;
		Ice.ObjectAdapter adapter;
		Ice.Identity id;

		try {
			
			ic = Ice.Util.initialize(args);
			adapter = ic.createObjectAdapterWithEndpoints("SimpleCalculatorAdapter", "tcp -h 127.0.0.1 -p 10000");
			
			Ice.Object object = new Casio();
			id = ic.stringToIdentity("SimpleCalculator");
			adapter.add(object, id);
			adapter.activate();
			
			System.out.println("SimpleCalulator server ready .... ");
			// ic.waitForShutdown();
			System.out.println("To Stop server pulse \"Return\" .... ");
			
			stdIn.readLine();
			// next 4 lines can be omitted. The 5th one will do this task if
			// next 4 lines removed.
			adapter.remove(id);
			adapter.deactivate();
			adapter.waitForDeactivate();
			adapter.destroy();
			ic.destroy();
		} catch (Ice.LocalException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
