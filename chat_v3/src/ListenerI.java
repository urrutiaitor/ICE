
public class ListenerI extends chat._ListenerDisp {
	private int lastMsgNumber = -1;

	public void messageNotification(int numMessage, Ice.Current __current) {
		lastMsgNumber = numMessage;
		System.out.println("\n\t\t------------- new Message posted to the Chat. Number " + lastMsgNumber + " ........\n");
	}

	public int getLastMsgNum() {
		return lastMsgNumber;
	}
}