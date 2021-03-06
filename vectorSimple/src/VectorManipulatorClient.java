public class VectorManipulatorClient {

	public static void main(String args[]) {
		int[] aVector = { 9, 8, 7, 6, 8, 7, 6, 5, 6, 5, 4, 3, 5, 4, 3, 2, 1, 1 };
		Ice.Communicator ic = null;
		utils.IntVectorHolder vectorHolder = new utils.IntVectorHolder();
		int i;

		try {
			ic = Ice.Util.initialize(args);
			Ice.ObjectPrx base = ic.stringToProxy("TheVectorManipulator:default -p 10000");
			utils.VectorManipulatorPrx theManipulator = utils.VectorManipulatorPrxHelper.checkedCast(base);
			if (theManipulator == null)
				throw new Error("Invalid proxy");
			
			System.out.print("Let us consider the next vector \n\t");
			for (i = 0; i < aVector.length; i++)
				System.out.print(aVector[i] + " ");
			System.out.println();
			
			System.out.print("\nAfter sorting it remains:\n\t");
			theManipulator.sort(aVector, vectorHolder);
			for (i = 0; i < vectorHolder.value.length; i++)
				System.out.print(vectorHolder.value[i] + " ");
			System.out.println();
			
			System.out.print("\nAnd after eliminting duplicates: \n\t");
			theManipulator.copyWithoutDuplicates(vectorHolder.value, vectorHolder);
			for (i = 0; i < vectorHolder.value.length; i++)
				System.out.print(vectorHolder.value[i] + " ");
			System.out.println();
			
			ic.destroy();
		} catch (Exception e) {
			System.out.println("ERROR : " + e);
			e.printStackTrace(System.out);
		}
	}
}
