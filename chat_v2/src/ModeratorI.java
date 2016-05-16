import chat.*;

public class ModeratorI extends _ChatModeratorDisp {
	private static final int MAX_LISTENERS = 3;
	private static final int MAX_STORED_MSGS = 5;
	private java.util.LinkedList<ListenerPrx> listeners;
	private java.util.LinkedList<String> msgList;
	private int nMsgs;

	public ModeratorI() {
		nMsgs = 0;
		msgList = new java.util.LinkedList<String>();
		listeners = new java.util.LinkedList<ListenerPrx>();
	}

	synchronized public void pushMessage(String str, ListenerPrx senderAssociatedListenerPrx, Ice.Current current) {
		int i;

		if (msgList.size() == MAX_STORED_MSGS)
			msgList.removeLast();
		msgList.addFirst(str);
		nMsgs++;
		for (i = 0; i < listeners.size(); i++)
			if (!listeners.get(i).ice_getIdentity().equals(senderAssociatedListenerPrx.ice_getIdentity()))
				listeners.get(i).messageNotification(nMsgs);
	}

	synchronized public boolean getMessage(int n, Ice.StringHolder str, Ice.Current current) {

		if ((n > nMsgs) || (n < 1) || ((nMsgs - n) > (MAX_STORED_MSGS - 1)))
			return false;
		str.value = msgList.get(nMsgs - n);
		return true;
	}

	synchronized public boolean registerNewListener(ListenerPrx listenerPrx, Ice.Current current) {
		if (listeners.size() > MAX_LISTENERS)
			return false;
		listeners.add(listenerPrx);
		System.out.println("New listener has been registered. Now, there are " + listeners.size());
		System.out.println("ICE id of the new listener: " + listenerPrx.ice_getIdentity());
		return true;
	}

	synchronized public boolean deleteListener(ListenerPrx listenerPrx, Ice.Current current) {
		int i;

		for (i = 0; i < listeners.size(); i++) {
			// if(Ice.Util.proxyIdentityCompare(listeners.get(i),
			// listenerPrx)==0)
			if (listeners.get(i).ice_getIdentity().equals(listenerPrx.ice_getIdentity())) {
				listeners.remove(i);
				System.out.println("A listener has gone. Now, there are: " + listeners.size());
				return true;
			}
		}
		return false;
	}
}
