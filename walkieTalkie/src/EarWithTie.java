import Ice.Current;


public class EarWithTie implements walkieTalkie._EarOperations
{
  public void pushMesssage(String msg, Current __current)
  {
    System.out.println("New message: "+'\"'+msg+'\"');
  }
}
