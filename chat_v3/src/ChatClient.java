
import java.io.*;

public class ChatClient {
	public static void main(String args[]) throws InterruptedException {

		int option, i;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Ice.Communicator ic = null;
		Ice.ObjectAdapter adapter;
		ListenerI myEar;
		Ice.ObjectPrx objPrx;
		chat.ListenerPrx myEarPrx;
		chat.ChatModeratorPrx theModerator;
		String str;
		Ice.StringHolder strHold = new Ice.StringHolder();

		if (args.length != 1) {
			System.out.println("Incorrect Invocation. Correct syntax: \"java ChatClient <port>\"");
			return;
		}
		
		try {
			ic = Ice.Util.initialize(args);
			adapter = ic.createObjectAdapterWithEndpoints("ListenerAdapter", "tcp -h 127.0.0.1 -p " + args[0]);
			
			myEar = new ListenerI();
			objPrx = adapter.addWithUUID(myEar);
			myEarPrx = chat.ListenerPrxHelper.uncheckedCast(objPrx);
			
			adapter.activate();
			objPrx = ic.stringToProxy("ChatModerator:tcp -h 127.0.0.1 -p 10000");
			theModerator = chat.ChatModeratorPrxHelper.checkedCast(objPrx);
			theModerator.registerNewListener(myEarPrx);
			while ((option = menu()) != 0) {
				switch (option) {
				case 1:
					System.out.print("Which Message? ");
					str = in.readLine();
					theModerator.pushMessage(str, myEarPrx);
					break;
				case 2:
					System.out.println("Last Notified Message Number " + myEar.getLastMsgNum());
					;
					System.out.print("Desired Message Number? ");
					str = in.readLine();
					i = Integer.valueOf(str).intValue();
					if (theModerator.getMessage(i, strHold))
						System.out.println("Message : " + i + ": " + strHold.value);
					else
						System.out.println("Inaccesible Message Number " + i);
					break;
				}
			}
			theModerator.deleteListener(myEarPrx);
			adapter.destroy();
			ic.destroy();

		} catch (Exception e) {
			System.out.println("ERROR : " + e);
			e.printStackTrace(System.out);
		}

	}

	static int menu() throws IOException {
		int opcion;
		String str;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Teclea:");
		System.out.println("\t1: para enviar un mensaje.");
		System.out.println("\t2: para leer un mensaje");
		System.out.println("\t0: para salir");
		str = in.readLine();
		opcion = Integer.valueOf(str).intValue();
		return opcion;
	}
}
