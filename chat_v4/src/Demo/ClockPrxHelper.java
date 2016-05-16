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

package Demo;

public final class ClockPrxHelper extends Ice.ObjectPrxHelperBase implements ClockPrx
{
    private static final String __publish_name = "publish";

    public void publish(String data)
    {
        publish(data, null, false);
    }

    public void publish(String data, java.util.Map<String, String> __ctx)
    {
        publish(data, __ctx, true);
    }

    private void publish(String data, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        end_publish(begin_publish(data, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_publish(String data)
    {
        return begin_publish(data, null, false, false, null);
    }

    public Ice.AsyncResult begin_publish(String data, java.util.Map<String, String> __ctx)
    {
        return begin_publish(data, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_publish(String data, Ice.Callback __cb)
    {
        return begin_publish(data, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_publish(String data, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_publish(data, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_publish(String data, Callback_Clock_publish __cb)
    {
        return begin_publish(data, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_publish(String data, java.util.Map<String, String> __ctx, Callback_Clock_publish __cb)
    {
        return begin_publish(data, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_publish(String data, 
                                         IceInternal.Functional_VoidCallback __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_publish(data, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_publish(String data, 
                                         IceInternal.Functional_VoidCallback __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                         IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_publish(data, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_publish(String data, 
                                         java.util.Map<String, String> __ctx, 
                                         IceInternal.Functional_VoidCallback __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_publish(data, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_publish(String data, 
                                         java.util.Map<String, String> __ctx, 
                                         IceInternal.Functional_VoidCallback __responseCb, 
                                         IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                         IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_publish(data, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_publish(String data, 
                                          java.util.Map<String, String> __ctx, 
                                          boolean __explicitCtx, 
                                          boolean __synchronous, 
                                          IceInternal.Functional_VoidCallback __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                          IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_publish(data, 
                             __ctx, 
                             __explicitCtx, 
                             __synchronous, 
                             new IceInternal.Functional_OnewayCallback(__responseCb, __exceptionCb, __sentCb));
    }

    private Ice.AsyncResult begin_publish(String data, 
                                          java.util.Map<String, String> __ctx, 
                                          boolean __explicitCtx, 
                                          boolean __synchronous, 
                                          IceInternal.CallbackBase __cb)
    {
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__publish_name, __cb);
        try
        {
            __result.prepare(__publish_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(data);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public void end_publish(Ice.AsyncResult __iresult)
    {
        __end(__iresult, __publish_name);
    }

    public static ClockPrx checkedCast(Ice.ObjectPrx __obj)
    {
        return checkedCastImpl(__obj, ice_staticId(), ClockPrx.class, ClockPrxHelper.class);
    }

    public static ClockPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __ctx, ice_staticId(), ClockPrx.class, ClockPrxHelper.class);
    }

    public static ClockPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return checkedCastImpl(__obj, __facet, ice_staticId(), ClockPrx.class, ClockPrxHelper.class);
    }

    public static ClockPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __facet, __ctx, ice_staticId(), ClockPrx.class, ClockPrxHelper.class);
    }

    public static ClockPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        return uncheckedCastImpl(__obj, ClockPrx.class, ClockPrxHelper.class);
    }

    public static ClockPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return uncheckedCastImpl(__obj, __facet, ClockPrx.class, ClockPrxHelper.class);
    }

    public static final String[] __ids =
    {
        "::Demo::Clock",
        "::Ice::Object"
    };

    public static String ice_staticId()
    {
        return __ids[0];
    }

    public static void __write(IceInternal.BasicStream __os, ClockPrx v)
    {
        __os.writeProxy(v);
    }

    public static ClockPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            ClockPrxHelper result = new ClockPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}