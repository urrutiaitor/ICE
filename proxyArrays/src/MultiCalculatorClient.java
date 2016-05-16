import utils.CalculatorVectorHolder;

public class MultiCalculatorClient {

	public static void main(String args[]) {
		int n1, n2;
		Ice.Communicator ic = null;
		Ice.ObjectPrx base;
		utils.CalculatorManagerPrx theIntermediate;
		try {
			ic = Ice.Util.initialize(args);
			base = ic.stringToProxy("TheCalculatorManager:tcp -h 127.0.0.1 -p 10000");
			theIntermediate = utils.CalculatorManagerPrxHelper.checkedCast(base);
			
			CalculatorVectorHolder calcVector = new CalculatorVectorHolder();
			theIntermediate.giveMeTheCalculators(calcVector);
			
			
			n1 = calcVector.value[1%calcVector.value.length].gcd(2048, 384);
			n2 = calcVector.value[2%calcVector.value.length].gcd(n1, 704);
			System.out.println("Did you know that gcd(384,704,2048)=" + n2 + "?");
			n1 = calcVector.value[3%calcVector.value.length].factorial(5);
			System.out.println("And that " + 5 + "!=" + n1 + "?");
			ic.destroy();
		} catch (Exception e) {
			System.out.println("ERROR : " + e);
			e.printStackTrace(System.out);
		}
	}
}
