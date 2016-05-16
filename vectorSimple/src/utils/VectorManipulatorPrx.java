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
// Generated from file `VectorManipulator.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package utils;

public interface VectorManipulatorPrx extends Ice.ObjectPrx
{
    public void sort(int[] inVector, IntVectorHolder outVector);

    public void sort(int[] inVector, IntVectorHolder outVector, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_sort(int[] inVector);

    public Ice.AsyncResult begin_sort(int[] inVector, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_sort(int[] inVector, Ice.Callback __cb);

    public Ice.AsyncResult begin_sort(int[] inVector, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_sort(int[] inVector, Callback_VectorManipulator_sort __cb);

    public Ice.AsyncResult begin_sort(int[] inVector, java.util.Map<String, String> __ctx, Callback_VectorManipulator_sort __cb);

    public Ice.AsyncResult begin_sort(int[] inVector, 
                                      IceInternal.Functional_GenericCallback1<int[]> __responseCb, 
                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_sort(int[] inVector, 
                                      IceInternal.Functional_GenericCallback1<int[]> __responseCb, 
                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                      IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_sort(int[] inVector, 
                                      java.util.Map<String, String> __ctx, 
                                      IceInternal.Functional_GenericCallback1<int[]> __responseCb, 
                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_sort(int[] inVector, 
                                      java.util.Map<String, String> __ctx, 
                                      IceInternal.Functional_GenericCallback1<int[]> __responseCb, 
                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                      IceInternal.Functional_BoolCallback __sentCb);

    public void end_sort(IntVectorHolder outVector, Ice.AsyncResult __result);

    public void copyWithoutDuplicates(int[] inVector, IntVectorHolder outVector);

    public void copyWithoutDuplicates(int[] inVector, IntVectorHolder outVector, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_copyWithoutDuplicates(int[] inVector);

    public Ice.AsyncResult begin_copyWithoutDuplicates(int[] inVector, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_copyWithoutDuplicates(int[] inVector, Ice.Callback __cb);

    public Ice.AsyncResult begin_copyWithoutDuplicates(int[] inVector, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_copyWithoutDuplicates(int[] inVector, Callback_VectorManipulator_copyWithoutDuplicates __cb);

    public Ice.AsyncResult begin_copyWithoutDuplicates(int[] inVector, java.util.Map<String, String> __ctx, Callback_VectorManipulator_copyWithoutDuplicates __cb);

    public Ice.AsyncResult begin_copyWithoutDuplicates(int[] inVector, 
                                                       IceInternal.Functional_GenericCallback1<int[]> __responseCb, 
                                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_copyWithoutDuplicates(int[] inVector, 
                                                       IceInternal.Functional_GenericCallback1<int[]> __responseCb, 
                                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                       IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_copyWithoutDuplicates(int[] inVector, 
                                                       java.util.Map<String, String> __ctx, 
                                                       IceInternal.Functional_GenericCallback1<int[]> __responseCb, 
                                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_copyWithoutDuplicates(int[] inVector, 
                                                       java.util.Map<String, String> __ctx, 
                                                       IceInternal.Functional_GenericCallback1<int[]> __responseCb, 
                                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                       IceInternal.Functional_BoolCallback __sentCb);

    public void end_copyWithoutDuplicates(IntVectorHolder outVector, Ice.AsyncResult __result);
}
