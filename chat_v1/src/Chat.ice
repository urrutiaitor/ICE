module chat
{
  interface Listener
  {
     void messageNotification(string msg);
  };

  interface ChatModerator
  {
    void pushMessage(string msg);
  };
};
