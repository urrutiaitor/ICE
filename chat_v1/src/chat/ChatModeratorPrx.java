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

public interface ChatModeratorPrx extends Ice.ObjectPrx
{
    public void pushMessage(String msg);

    public void pushMessage(String msg, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_pushMessage(String msg);

    public Ice.AsyncResult begin_pushMessage(String msg, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_pushMessage(String msg, Ice.Callback __cb);

    public Ice.AsyncResult begin_pushMessage(String msg, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_pushMessage(String msg, Callback_ChatModerator_pushMessage __cb);

    public Ice.AsyncResult begin_pushMessage(String msg, java.util.Map<String, String> __ctx, Callback_ChatModerator_pushMessage __cb);

    public Ice.AsyncResult begin_pushMessage(String msg, 
                                             IceInternal.Functional_VoidCallback __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_pushMessage(String msg, 
                                             IceInternal.Functional_VoidCallback __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_pushMessage(String msg, 
                                             java.util.Map<String, String> __ctx, 
                                             IceInternal.Functional_VoidCallback __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_pushMessage(String msg, 
                                             java.util.Map<String, String> __ctx, 
                                             IceInternal.Functional_VoidCallback __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb);

    public void end_pushMessage(Ice.AsyncResult __result);
}