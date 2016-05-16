import java.util.Scanner;

import voting.VoteVectorHolder;

public class User {

	public static void main(String[] args) {
		Ice.Communicator ic = null;
		Ice.ObjectAdapter adapter;
		Ice.Identity id;
		Scanner keyboard = new Scanner(System.in);
		
		if (args.length != 3) {
			System.out.println("Incorrect Invocation. Correct syntax: \"java User <port> <nextPort> <remaining users>\"");
			return;
		}
		
		VoteVectorHolder votes = new VoteVectorHolder();
		System.out.println("Your vote: ");
		int[] voteVector = new int[Integer.valueOf(args[2]) + 1];
		voteVector[0] = keyboard.nextInt(); keyboard.nextLine();
		votes.value = voteVector;
		
		if (Integer.valueOf(args[2]) > 0) {
			/* CLIENT */
			ic = Ice.Util.initialize(args);
			Ice.ObjectPrx base = ic.stringToProxy("TheVectorManipulator:tcp -h 127.0.0.1 -p " + args[1]);
			voting.VoterPrx theVoter = voting.VoterPrxHelper.checkedCast(base);
			if (theVoter == null)
				throw new Error("Invalid proxy");
			
			
			System.out.println("Votes: ");
			for (int i = 0; i < votes.value.length; i++){
				System.out.print(votes.value[i] + " / ");
			}
			
			
			theVoter.vote(Integer.valueOf(args[2]), votes);
		}
		
		/* SERVER */
		ic = Ice.Util.initialize(args);
		adapter = ic.createObjectAdapterWithEndpoints("VectorManipulatorAdapter", "tcp -h 127.0.0.1 -p " + args[0]);

		Ice.Object object = new VectorManipulatorI(votes);
		id = ic.stringToIdentity("TheVectorManipulator");
		adapter.add(object, id);
		adapter.activate();
		
		System.out.println("Votes: ");
		for (int i = 0; i < votes.value.length; i++){
			System.out.print(votes.value[i] + " / ");
		}
		
		System.out.println("ENTER to EXIT");
		keyboard.nextLine();
		
		ic.destroy();
	}

}
