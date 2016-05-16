import java.util.Scanner;

import Ice.Current;
import voting.VoteVectorHolder;


public class VectorManipulatorI extends voting._VoterDisp 
{

	VoteVectorHolder votes;
	
	public VectorManipulatorI(VoteVectorHolder votes) {
		this.votes = votes;
	}

	@Override
	public int vote(int nVoters, VoteVectorHolder votes, Current __current) {
		Scanner keyboard = new Scanner(System.in);
		
		int[] newVoteVector = new int[votes.value.length + 1];
		
		for (int i = 0; i < votes.value.length; i++) {
			newVoteVector[i] = votes.value[i];
		}
		
		System.out.println("Your vote: ");
		newVoteVector[votes.value.length] = keyboard.nextInt(); keyboard.nextLine();
		
		
		
		return nVoters - 1;
	}
}
