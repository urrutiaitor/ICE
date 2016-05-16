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

public interface CalculatorManagerPrx extends Ice.ObjectPrx
{
    public void giveMeTheCalculators(CalculatorVectorHolder calcVector);

    public void giveMeTheCalculators(CalculatorVectorHolder calcVector, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_giveMeTheCalculators();

    public Ice.AsyncResult begin_giveMeTheCalculators(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_giveMeTheCalculators(Ice.Callback __cb);

    public Ice.AsyncResult begin_giveMeTheCalculators(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_giveMeTheCalculators(Callback_CalculatorManager_giveMeTheCalculators __cb);

    public Ice.AsyncResult begin_giveMeTheCalculators(java.util.Map<String, String> __ctx, Callback_CalculatorManager_giveMeTheCalculators __cb);

    public Ice.AsyncResult begin_giveMeTheCalculators(IceInternal.Functional_GenericCallback1<CalculatorPrx[]> __responseCb, 
                                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_giveMeTheCalculators(IceInternal.Functional_GenericCallback1<CalculatorPrx[]> __responseCb, 
                                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                      IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_giveMeTheCalculators(java.util.Map<String, String> __ctx, 
                                                      IceInternal.Functional_GenericCallback1<CalculatorPrx[]> __responseCb, 
                                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_giveMeTheCalculators(java.util.Map<String, String> __ctx, 
                                                      IceInternal.Functional_GenericCallback1<CalculatorPrx[]> __responseCb, 
                                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                      IceInternal.Functional_BoolCallback __sentCb);

    public void end_giveMeTheCalculators(CalculatorVectorHolder calcVector, Ice.AsyncResult __result);
}