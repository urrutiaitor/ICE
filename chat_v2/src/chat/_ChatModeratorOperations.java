// **********************************************************************
//
// Copyright (c) 2003-2015 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.1
//
// <auto-generated>
//
// Generated from file `Chat.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package chat;

public interface _ChatModeratorOperations
{
    boolean registerNewListener(ListenerPrx aListener, Ice.Current __current);

    boolean deleteListener(ListenerPrx aListener, Ice.Current __current);

    void pushMessage(String msg, ListenerPrx senderAssociatedListener, Ice.Current __current);

    boolean getMessage(int msgNumer, Ice.StringHolder msg, Ice.Current __current);
}
