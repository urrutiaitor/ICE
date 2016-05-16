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

public final class ListenerPrxHelper extends Ice.ObjectPrxHelperBase implements ListenerPrx
{
    private static final String __messageNotification_name = "messageNotification";

    public void messageNotification(String msg)
    {
        messageNotification(msg, null, false);
    }

    public void messageNotification(String msg, java.util.Map<String, String> __ctx)
    {
        messageNotification(msg, __ctx, true);
    }

    private void messageNotification(String msg, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        end_messageNotification(begin_messageNotification(msg, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_messageNotification(String msg)
    {
        return begin_messageNotification(msg, null, false, false, null);
    }

    public Ice.AsyncResult begin_messageNotification(String msg, java.util.Map<String, String> __ctx)
    {
        return begin_messageNotification(msg, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_messageNotification(String msg, Ice.Callback __cb)
    {
        return begin_messageNotification(msg, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_messageNotification(String msg, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_messageNotification(msg, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_messageNotification(String msg, Callback_Listener_messageNotification __cb)
    {
        return begin_messageNotification(msg, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_messageNotification(String msg, java.util.Map<String, String> __ctx, Callback_Listener_messageNotification __cb)
    {
        return begin_messageNotification(msg, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_messageNotification(String msg, 
                                                     IceInternal.Functional_VoidCallback __responseCb, 
                                                     IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_messageNotification(msg, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_messageNotification(String msg, 
                                                     IceInternal.Functional_VoidCallback __responseCb, 
                                                     IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                     IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_messageNotification(msg, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_messageNotification(String msg, 
                                                     java.util.Map<String, String> __ctx, 
                                                     IceInternal.Functional_VoidCallback __responseCb, 
                                                     IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_messageNotification(msg, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_messageNotification(String msg, 
                                                     java.util.Map<String, String> __ctx, 
                                                     IceInternal.Functional_VoidCallback __responseCb, 
                                                     IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                     IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_messageNotification(msg, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_messageNotification(String msg, 
                                                      java.util.Map<String, String> __ctx, 
                                                      boolean __explicitCtx, 
                                                      boolean __synchronous, 
                                                      IceInternal.Functional_VoidCallback __responseCb, 
                                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                      IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_messageNotification(msg, 
                                         __ctx, 
                                         __explicitCtx, 
                                         __synchronous, 
                                         new IceInternal.Functional_OnewayCallback(__responseCb, __exceptionCb, __sentCb));
    }

    private Ice.AsyncResult begin_messageNotification(String msg, 
                                                      java.util.Map<String, String> __ctx, 
                                                      boolean __explicitCtx, 
                                                      boolean __synchronous, 
                                                      IceInternal.CallbackBase __cb)
    {
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__messageNotification_name, __cb);
        try
        {
            __result.prepare(__messageNotification_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(msg);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public void end_messageNotification(Ice.AsyncResult __iresult)
    {
        __end(__iresult, __messageNotification_name);
    }

    public static ListenerPrx checkedCast(Ice.ObjectPrx __obj)
    {
        return checkedCastImpl(__obj, ice_staticId(), ListenerPrx.class, ListenerPrxHelper.class);
    }

    public static ListenerPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __ctx, ice_staticId(), ListenerPrx.class, ListenerPrxHelper.class);
    }

    public static ListenerPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return checkedCastImpl(__obj, __facet, ice_staticId(), ListenerPrx.class, ListenerPrxHelper.class);
    }

    public static ListenerPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __facet, __ctx, ice_staticId(), ListenerPrx.class, ListenerPrxHelper.class);
    }

    public static ListenerPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        return uncheckedCastImpl(__obj, ListenerPrx.class, ListenerPrxHelper.class);
    }

    public static ListenerPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return uncheckedCastImpl(__obj, __facet, ListenerPrx.class, ListenerPrxHelper.class);
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::chat::Listener"
    };

    public static String ice_staticId()
    {
        return __ids[1];
    }

    public static void __write(IceInternal.BasicStream __os, ListenerPrx v)
    {
        __os.writeProxy(v);
    }

    public static ListenerPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            ListenerPrxHelper result = new ListenerPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}