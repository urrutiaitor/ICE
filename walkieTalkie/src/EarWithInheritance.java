import Ice.Current;
import walkieTalkie.*;


public class EarWithInheritance extends _EarDisp
{
  public void pushMesssage(String msg, Current __current)
  {
	  System.out.println("\tNew message: "+'\"'+msg+'\"');
	}
}
