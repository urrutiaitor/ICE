public class SimpleCalculusClient {

	public static void main(String args[]) {
		int n1, n2;
		Ice.Communicator ic = null;

		try {
			ic = Ice.Util.initialize(args);
			Ice.ObjectPrx base = ic.stringToProxy("SimpleCalculator:tcp -h 127.0.0.1 -p 10000");
			// Ice.ObjectPrx base = ic.stringToProxy("SimpleCalculator:tcp -h
			// 172.17.100.24 -p 8000");
			utils.CalculatorPrx calculator = utils.CalculatorPrxHelper.checkedCast(base);
			if (calculator == null)
				throw new Error("Invalid proxy");
			n1 = calculator.gcd(2048, 384);
			n2 = calculator.gcd(n1, 704);
			System.out.println("mcd(384,704,2048)=" + n2);
			ic.destroy();
		} catch (Exception e) {
			System.out.println("ERROR : " + e);
			e.printStackTrace(System.out);
		}
	}
}
