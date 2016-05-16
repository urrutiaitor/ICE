import chat.*;

public class ModeratorI extends _ChatModeratorDisp {
	protected chat.ListenerPrx aListener;
	protected Ice.Communicator ic = null;

	public ModeratorI(Ice.Communicator ic) {
		Ice.ObjectPrx objPrx;

		objPrx = ic.stringToProxy("AListener: tcp -h 127.0.0.1 -p 10001");
		aListener = chat.ListenerPrxHelper.checkedCast(objPrx);
	}

	synchronized public void pushMessage(String str, Ice.Current current) {
		System.out.println("new message: " + str);
		if (aListener != null)
			aListener.messageNotification(str);
	}

}
