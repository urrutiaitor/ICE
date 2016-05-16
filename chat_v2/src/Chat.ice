module chat
{
  interface Listener
  {
    void messageNotification(int numMessage);
  };
  
  interface ChatModerator
  {
    bool registerNewListener(Listener* aListener);
    bool deleteListener(Listener* aListener);
    void pushMessage(string msg, Listener* senderAssociatedListener);
    bool getMessage(int msgNumer, out string msg);
  };
};
