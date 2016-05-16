import utils.CalculatorPrx;

public class CalculatorManagerI extends utils._CalculatorManagerDisp {
	protected final int NUM_CALCULATORS = 3;
	protected utils.CalculatorPrx calcProxies[];
	protected int turn;

	public CalculatorManagerI(Ice.ObjectAdapter adapter) {
		int i;

		turn = 0;
		calcProxies = new utils.CalculatorPrx[NUM_CALCULATORS];
		for (i = 0; i < NUM_CALCULATORS; i++) {
			
			Casio aCasio = new Casio(i);
			Ice.ObjectPrx objPrx = adapter.addWithUUID(aCasio);
			utils.CalculatorPrx aCalculatorPrx = utils.CalculatorPrxHelper.uncheckedCast(objPrx);
			calcProxies[i] = aCalculatorPrx;
			
		}
		adapter.add(this, adapter.getCommunicator().stringToIdentity("TheCalculatorManager"));
	}

	public CalculatorPrx giveMeOneCalculatorReference(Ice.Current __current) {
		turn = (turn + 1) % NUM_CALCULATORS;
		return calcProxies[turn];
	}
}
