
public class Receptor extends forum._ListenerDisp {
	public void newPublication(String str, Ice.Current __current) {
		System.out.println("new publication: " + str);
	}
}
