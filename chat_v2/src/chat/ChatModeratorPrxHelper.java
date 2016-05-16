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

public final class ChatModeratorPrxHelper extends Ice.ObjectPrxHelperBase implements ChatModeratorPrx
{
    private static final String __deleteListener_name = "deleteListener";

    public boolean deleteListener(ListenerPrx aListener)
    {
        return deleteListener(aListener, null, false);
    }

    public boolean deleteListener(ListenerPrx aListener, java.util.Map<String, String> __ctx)
    {
        return deleteListener(aListener, __ctx, true);
    }

    private boolean deleteListener(ListenerPrx aListener, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__deleteListener_name);
        return end_deleteListener(begin_deleteListener(aListener, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_deleteListener(ListenerPrx aListener)
    {
        return begin_deleteListener(aListener, null, false, false, null);
    }

    public Ice.AsyncResult begin_deleteListener(ListenerPrx aListener, java.util.Map<String, String> __ctx)
    {
        return begin_deleteListener(aListener, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_deleteListener(ListenerPrx aListener, Ice.Callback __cb)
    {
        return begin_deleteListener(aListener, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_deleteListener(ListenerPrx aListener, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_deleteListener(aListener, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_deleteListener(ListenerPrx aListener, Callback_ChatModerator_deleteListener __cb)
    {
        return begin_deleteListener(aListener, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_deleteListener(ListenerPrx aListener, java.util.Map<String, String> __ctx, Callback_ChatModerator_deleteListener __cb)
    {
        return begin_deleteListener(aListener, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_deleteListener(ListenerPrx aListener, 
                                                IceInternal.Functional_BoolCallback __responseCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_deleteListener(aListener, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_deleteListener(ListenerPrx aListener, 
                                                IceInternal.Functional_BoolCallback __responseCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_deleteListener(aListener, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_deleteListener(ListenerPrx aListener, 
                                                java.util.Map<String, String> __ctx, 
                                                IceInternal.Functional_BoolCallback __responseCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_deleteListener(aListener, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_deleteListener(ListenerPrx aListener, 
                                                java.util.Map<String, String> __ctx, 
                                                IceInternal.Functional_BoolCallback __responseCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_deleteListener(aListener, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_deleteListener(ListenerPrx aListener, 
                                                 java.util.Map<String, String> __ctx, 
                                                 boolean __explicitCtx, 
                                                 boolean __synchronous, 
                                                 IceInternal.Functional_BoolCallback __responseCb, 
                                                 IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                 IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_deleteListener(aListener, __ctx, __explicitCtx, __synchronous, 
                                    new IceInternal.Functional_TwowayCallbackBool(__responseCb, __exceptionCb, __sentCb)
                                        {
                                            public final void __completed(Ice.AsyncResult __result)
                                            {
                                                ChatModeratorPrxHelper.__deleteListener_completed(this, __result);
                                            }
                                        });
    }

    private Ice.AsyncResult begin_deleteListener(ListenerPrx aListener, 
                                                 java.util.Map<String, String> __ctx, 
                                                 boolean __explicitCtx, 
                                                 boolean __synchronous, 
                                                 IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__deleteListener_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__deleteListener_name, __cb);
        try
        {
            __result.prepare(__deleteListener_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            ListenerPrxHelper.__write(__os, aListener);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public boolean end_deleteListener(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __deleteListener_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            boolean __ret;
            __ret = __is.readBool();
            __result.endReadParams();
            return __ret;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __deleteListener_completed(Ice.TwowayCallbackBool __cb, Ice.AsyncResult __result)
    {
        chat.ChatModeratorPrx __proxy = (chat.ChatModeratorPrx)__result.getProxy();
        boolean __ret = false;
        try
        {
            __ret = __proxy.end_deleteListener(__result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret);
    }

    private static final String __getMessage_name = "getMessage";

    public boolean getMessage(int msgNumer, Ice.StringHolder msg)
    {
        return getMessage(msgNumer, msg, null, false);
    }

    public boolean getMessage(int msgNumer, Ice.StringHolder msg, java.util.Map<String, String> __ctx)
    {
        return getMessage(msgNumer, msg, __ctx, true);
    }

    private boolean getMessage(int msgNumer, Ice.StringHolder msg, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__getMessage_name);
        return end_getMessage(msg, begin_getMessage(msgNumer, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_getMessage(int msgNumer)
    {
        return begin_getMessage(msgNumer, null, false, false, null);
    }

    public Ice.AsyncResult begin_getMessage(int msgNumer, java.util.Map<String, String> __ctx)
    {
        return begin_getMessage(msgNumer, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_getMessage(int msgNumer, Ice.Callback __cb)
    {
        return begin_getMessage(msgNumer, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getMessage(int msgNumer, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getMessage(msgNumer, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getMessage(int msgNumer, Callback_ChatModerator_getMessage __cb)
    {
        return begin_getMessage(msgNumer, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getMessage(int msgNumer, java.util.Map<String, String> __ctx, Callback_ChatModerator_getMessage __cb)
    {
        return begin_getMessage(msgNumer, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getMessage(int msgNumer, 
                                            FunctionalCallback_ChatModerator_getMessage_Response __responseCb, 
                                            IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_getMessage(msgNumer, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getMessage(int msgNumer, 
                                            FunctionalCallback_ChatModerator_getMessage_Response __responseCb, 
                                            IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                            IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getMessage(msgNumer, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_getMessage(int msgNumer, 
                                            java.util.Map<String, String> __ctx, 
                                            FunctionalCallback_ChatModerator_getMessage_Response __responseCb, 
                                            IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_getMessage(msgNumer, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getMessage(int msgNumer, 
                                            java.util.Map<String, String> __ctx, 
                                            FunctionalCallback_ChatModerator_getMessage_Response __responseCb, 
                                            IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                            IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getMessage(msgNumer, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_getMessage(int msgNumer, 
                                             java.util.Map<String, String> __ctx, 
                                             boolean __explicitCtx, 
                                             boolean __synchronous, 
                                             FunctionalCallback_ChatModerator_getMessage_Response __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb)
    {
        class CB extends IceInternal.Functional_TwowayCallback implements _Callback_ChatModerator_getMessage
        {
            public CB(FunctionalCallback_ChatModerator_getMessage_Response responseCb, 
                      IceInternal.Functional_GenericCallback1<Ice.Exception> exceptionCb, 
                      IceInternal.Functional_BoolCallback sentCb)
            {
                super(responseCb != null, exceptionCb, sentCb);
                __responseCb = responseCb;
            }

            public void response(boolean __ret, String msg)
            {
                if(__responseCb != null)
                {
                    __responseCb.apply(__ret, msg);
                }
            }

            public final void __completed(Ice.AsyncResult __result)
            {
                ChatModeratorPrxHelper.__getMessage_completed(this, __result);
            }

            private final FunctionalCallback_ChatModerator_getMessage_Response __responseCb;
        }
        return begin_getMessage(msgNumer, __ctx, __explicitCtx, __synchronous, new CB(__responseCb, __exceptionCb, __sentCb));
    }

    private Ice.AsyncResult begin_getMessage(int msgNumer, 
                                             java.util.Map<String, String> __ctx, 
                                             boolean __explicitCtx, 
                                             boolean __synchronous, 
                                             IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getMessage_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__getMessage_name, __cb);
        try
        {
            __result.prepare(__getMessage_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeInt(msgNumer);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public boolean end_getMessage(Ice.StringHolder msg, Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __getMessage_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            msg.value = __is.readString();
            boolean __ret;
            __ret = __is.readBool();
            __result.endReadParams();
            return __ret;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __getMessage_completed(_Callback_ChatModerator_getMessage __cb, Ice.AsyncResult __result)
    {
        chat.ChatModeratorPrx __proxy = (chat.ChatModeratorPrx)__result.getProxy();
        boolean __ret = false;
        Ice.StringHolder msg = new Ice.StringHolder();
        try
        {
            __ret = __proxy.end_getMessage(msg, __result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret, msg.value);
    }

    private static final String __pushMessage_name = "pushMessage";

    public void pushMessage(String msg, ListenerPrx senderAssociatedListener)
    {
        pushMessage(msg, senderAssociatedListener, null, false);
    }

    public void pushMessage(String msg, ListenerPrx senderAssociatedListener, java.util.Map<String, String> __ctx)
    {
        pushMessage(msg, senderAssociatedListener, __ctx, true);
    }

    private void pushMessage(String msg, ListenerPrx senderAssociatedListener, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        end_pushMessage(begin_pushMessage(msg, senderAssociatedListener, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_pushMessage(String msg, ListenerPrx senderAssociatedListener)
    {
        return begin_pushMessage(msg, senderAssociatedListener, null, false, false, null);
    }

    public Ice.AsyncResult begin_pushMessage(String msg, ListenerPrx senderAssociatedListener, java.util.Map<String, String> __ctx)
    {
        return begin_pushMessage(msg, senderAssociatedListener, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_pushMessage(String msg, ListenerPrx senderAssociatedListener, Ice.Callback __cb)
    {
        return begin_pushMessage(msg, senderAssociatedListener, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_pushMessage(String msg, ListenerPrx senderAssociatedListener, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_pushMessage(msg, senderAssociatedListener, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_pushMessage(String msg, ListenerPrx senderAssociatedListener, Callback_ChatModerator_pushMessage __cb)
    {
        return begin_pushMessage(msg, senderAssociatedListener, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_pushMessage(String msg, ListenerPrx senderAssociatedListener, java.util.Map<String, String> __ctx, Callback_ChatModerator_pushMessage __cb)
    {
        return begin_pushMessage(msg, senderAssociatedListener, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_pushMessage(String msg, 
                                             ListenerPrx senderAssociatedListener, 
                                             IceInternal.Functional_VoidCallback __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_pushMessage(msg, senderAssociatedListener, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_pushMessage(String msg, 
                                             ListenerPrx senderAssociatedListener, 
                                             IceInternal.Functional_VoidCallback __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_pushMessage(msg, senderAssociatedListener, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_pushMessage(String msg, 
                                             ListenerPrx senderAssociatedListener, 
                                             java.util.Map<String, String> __ctx, 
                                             IceInternal.Functional_VoidCallback __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_pushMessage(msg, senderAssociatedListener, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_pushMessage(String msg, 
                                             ListenerPrx senderAssociatedListener, 
                                             java.util.Map<String, String> __ctx, 
                                             IceInternal.Functional_VoidCallback __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_pushMessage(msg, senderAssociatedListener, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_pushMessage(String msg, 
                                              ListenerPrx senderAssociatedListener, 
                                              java.util.Map<String, String> __ctx, 
                                              boolean __explicitCtx, 
                                              boolean __synchronous, 
                                              IceInternal.Functional_VoidCallback __responseCb, 
                                              IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                              IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_pushMessage(msg, 
                                 senderAssociatedListener, 
                                 __ctx, 
                                 __explicitCtx, 
                                 __synchronous, 
                                 new IceInternal.Functional_OnewayCallback(__responseCb, __exceptionCb, __sentCb));
    }

    private Ice.AsyncResult begin_pushMessage(String msg, 
                                              ListenerPrx senderAssociatedListener, 
                                              java.util.Map<String, String> __ctx, 
                                              boolean __explicitCtx, 
                                              boolean __synchronous, 
                                              IceInternal.CallbackBase __cb)
    {
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__pushMessage_name, __cb);
        try
        {
            __result.prepare(__pushMessage_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(msg);
            ListenerPrxHelper.__write(__os, senderAssociatedListener);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public void end_pushMessage(Ice.AsyncResult __iresult)
    {
        __end(__iresult, __pushMessage_name);
    }

    private static final String __registerNewListener_name = "registerNewListener";

    public boolean registerNewListener(ListenerPrx aListener)
    {
        return registerNewListener(aListener, null, false);
    }

    public boolean registerNewListener(ListenerPrx aListener, java.util.Map<String, String> __ctx)
    {
        return registerNewListener(aListener, __ctx, true);
    }

    private boolean registerNewListener(ListenerPrx aListener, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__registerNewListener_name);
        return end_registerNewListener(begin_registerNewListener(aListener, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_registerNewListener(ListenerPrx aListener)
    {
        return begin_registerNewListener(aListener, null, false, false, null);
    }

    public Ice.AsyncResult begin_registerNewListener(ListenerPrx aListener, java.util.Map<String, String> __ctx)
    {
        return begin_registerNewListener(aListener, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_registerNewListener(ListenerPrx aListener, Ice.Callback __cb)
    {
        return begin_registerNewListener(aListener, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_registerNewListener(ListenerPrx aListener, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_registerNewListener(aListener, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_registerNewListener(ListenerPrx aListener, Callback_ChatModerator_registerNewListener __cb)
    {
        return begin_registerNewListener(aListener, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_registerNewListener(ListenerPrx aListener, java.util.Map<String, String> __ctx, Callback_ChatModerator_registerNewListener __cb)
    {
        return begin_registerNewListener(aListener, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_registerNewListener(ListenerPrx aListener, 
                                                     IceInternal.Functional_BoolCallback __responseCb, 
                                                     IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_registerNewListener(aListener, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_registerNewListener(ListenerPrx aListener, 
                                                     IceInternal.Functional_BoolCallback __responseCb, 
                                                     IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                     IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_registerNewListener(aListener, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_registerNewListener(ListenerPrx aListener, 
                                                     java.util.Map<String, String> __ctx, 
                                                     IceInternal.Functional_BoolCallback __responseCb, 
                                                     IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_registerNewListener(aListener, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_registerNewListener(ListenerPrx aListener, 
                                                     java.util.Map<String, String> __ctx, 
                                                     IceInternal.Functional_BoolCallback __responseCb, 
                                                     IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                     IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_registerNewListener(aListener, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_registerNewListener(ListenerPrx aListener, 
                                                      java.util.Map<String, String> __ctx, 
                                                      boolean __explicitCtx, 
                                                      boolean __synchronous, 
                                                      IceInternal.Functional_BoolCallback __responseCb, 
                                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                      IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_registerNewListener(aListener, __ctx, __explicitCtx, __synchronous, 
                                         new IceInternal.Functional_TwowayCallbackBool(__responseCb, __exceptionCb, __sentCb)
                                             {
                                                 public final void __completed(Ice.AsyncResult __result)
                                                 {
                                                     ChatModeratorPrxHelper.__registerNewListener_completed(this, __result);
                                                 }
                                             });
    }

    private Ice.AsyncResult begin_registerNewListener(ListenerPrx aListener, 
                                                      java.util.Map<String, String> __ctx, 
                                                      boolean __explicitCtx, 
                                                      boolean __synchronous, 
                                                      IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__registerNewListener_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__registerNewListener_name, __cb);
        try
        {
            __result.prepare(__registerNewListener_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            ListenerPrxHelper.__write(__os, aListener);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public boolean end_registerNewListener(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __registerNewListener_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            boolean __ret;
            __ret = __is.readBool();
            __result.endReadParams();
            return __ret;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __registerNewListener_completed(Ice.TwowayCallbackBool __cb, Ice.AsyncResult __result)
    {
        chat.ChatModeratorPrx __proxy = (chat.ChatModeratorPrx)__result.getProxy();
        boolean __ret = false;
        try
        {
            __ret = __proxy.end_registerNewListener(__result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret);
    }

    public static ChatModeratorPrx checkedCast(Ice.ObjectPrx __obj)
    {
        return checkedCastImpl(__obj, ice_staticId(), ChatModeratorPrx.class, ChatModeratorPrxHelper.class);
    }

    public static ChatModeratorPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __ctx, ice_staticId(), ChatModeratorPrx.class, ChatModeratorPrxHelper.class);
    }

    public static ChatModeratorPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return checkedCastImpl(__obj, __facet, ice_staticId(), ChatModeratorPrx.class, ChatModeratorPrxHelper.class);
    }

    public static ChatModeratorPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __facet, __ctx, ice_staticId(), ChatModeratorPrx.class, ChatModeratorPrxHelper.class);
    }

    public static ChatModeratorPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        return uncheckedCastImpl(__obj, ChatModeratorPrx.class, ChatModeratorPrxHelper.class);
    }

    public static ChatModeratorPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return uncheckedCastImpl(__obj, __facet, ChatModeratorPrx.class, ChatModeratorPrxHelper.class);
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::chat::ChatModerator"
    };

    public static String ice_staticId()
    {
        return __ids[1];
    }

    public static void __write(IceInternal.BasicStream __os, ChatModeratorPrx v)
    {
        __os.writeProxy(v);
    }

    public static ChatModeratorPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            ChatModeratorPrxHelper result = new ChatModeratorPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
