public class VectorManipulatorResidence {
	public static void main(String args[]) {
		Ice.Communicator ic = null;
		Ice.ObjectAdapter adapter;
		Ice.Identity id;

		ic = Ice.Util.initialize(args);
		adapter = ic.createObjectAdapterWithEndpoints("VectorManipulatorAdapter", "default -p 10000");
		
		Ice.Object object = new utils._VectorManipulatorTie(new VectorManipulatorI());
		id = ic.stringToIdentity("TheVectorManipulator");
		adapter.add(object, id);
		adapter.activate();
		
		System.out.println("VectorManipulator server ready .... ");
		ic.waitForShutdown();
		ic.destroy();
	}
}
