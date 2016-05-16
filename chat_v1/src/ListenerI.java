import Ice.Current;
import chat._ChatModeratorDisp;


public class ListenerI extends chat._ListenerDisp
{
  public void messageNotification(String msg, Current __current)
  {
    System.out.println("new message: "+msg);
  }
}
