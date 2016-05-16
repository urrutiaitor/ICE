
import java.io.*;

public class ChatClient {
	public static void main(String args[]) throws InterruptedException {

		int option;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Ice.Communicator ic = null;
		Ice.ObjectPrx objPrx;
		chat.ChatModeratorPrx theModerator;
		String str;

		try {
			ic = Ice.Util.initialize(args);
			objPrx = ic.stringToProxy("ChatModerator:tcp -h 127.0.0.1 -p 10000");
			theModerator = chat.ChatModeratorPrxHelper.checkedCast(objPrx);
			
			while ((option = menu()) != 0) {
				switch (option) {
				case 1:
					System.out.print("Which Message? ");
					str = in.readLine();
					theModerator.pushMessage(str);
					break;
				}
			}
			
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
		System.out.println("\t0: para salir");
		str = in.readLine();
		opcion = Integer.valueOf(str).intValue();
		return opcion;
	}
}
