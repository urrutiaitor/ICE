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
// Generated from file `Calculator.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package utils;

public abstract class Callback_CalculatorManager_giveMeTheCalculators
    extends IceInternal.TwowayCallback implements Ice.TwowayCallbackArg1<utils.CalculatorPrx[]>
{
    public final void __completed(Ice.AsyncResult __result)
    {
        CalculatorManagerPrxHelper.__giveMeTheCalculators_completed(this, __result);
    }
}