// **********************************************************************
//
// Copyright (c) 2003-2016 ZeroC, Inc. All rights reserved.
//
// **********************************************************************

import Demo.*;

public class Subscriber extends Ice.Application
{
    public class ClockI extends _ClockDisp
    {
        @Override
        public void
        publish(String data, Ice.Current current)
        {
            System.out.println(data);
        }
    }

    @Override
    public int run(String[] args) {
        args = communicator().getProperties().parseCommandLineOptions("Clock", args);

        String topicName = "time";
        //String option = "None";
        boolean batch = false;
        String id = null;

        IceStorm.TopicManagerPrx manager = IceStorm.TopicManagerPrxHelper.checkedCast(
            communicator().propertyToProxy("TopicManager.Proxy"));
        if(manager == null)
        {
            System.err.println("invalid proxy");
            return 1;
        }

        //
        // Retrieve the topic.
        //
        IceStorm.TopicPrx topic;
        try
        {
            topic = manager.retrieve(topicName);
        }
        catch(IceStorm.NoSuchTopic e)
        {
            try
            {
                topic = manager.create(topicName);
            }
            catch(IceStorm.TopicExists ex)
            {
                System.err.println(appName() + ": temporary failure, try again.");
                return 1;
            }
        }

        Ice.ObjectAdapter adapter = communicator().createObjectAdapter("Clock.Subscriber");

        //
        // Add a servant for the Ice object. If --id is used the
        // identity comes from the command line, otherwise a UUID is
        // used.
        //
        // id is not directly altered since it is used below to detect
        // whether subscribeAndGetPublisher can raise
        // AlreadySubscribed.
        //
        Ice.Identity subId = new Ice.Identity(id, "");
        if(subId.name == null)
        {
            subId.name = java.util.UUID.randomUUID().toString();
        }
        Ice.ObjectPrx subscriber = adapter.add(new ClockI(), subId);

        //
        // Activate the object adapter before subscribing.
        //
        adapter.activate();

        //java.util.Map<String, String> qos = new java.util.HashMap<String, String>();
        
        if(batch)
        {
            subscriber = subscriber.ice_batchOneway();
        }
        else
        {
            subscriber = subscriber.ice_oneway();
        }

        shutdownOnInterrupt();
        communicator().waitForShutdown();

        topic.unsubscribe(subscriber);

        return 0;
    }

    public static void
    main(String[] args)
    {
        Subscriber app = new Subscriber();
        int status = app.main("Subscriber", args, "config.sub");
        System.exit(status);
    }
}
