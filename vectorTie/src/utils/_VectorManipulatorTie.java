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

public class _VectorManipulatorTie extends _VectorManipulatorDisp implements Ice.TieBase
{
    public _VectorManipulatorTie()
    {
    }

    public _VectorManipulatorTie(_VectorManipulatorOperations delegate)
    {
        _ice_delegate = delegate;
    }

    public java.lang.Object ice_delegate()
    {
        return _ice_delegate;
    }

    public void ice_delegate(java.lang.Object delegate)
    {
        _ice_delegate = (_VectorManipulatorOperations)delegate;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        if(!(rhs instanceof _VectorManipulatorTie))
        {
            return false;
        }

        return _ice_delegate.equals(((_VectorManipulatorTie)rhs)._ice_delegate);
    }

    public int hashCode()
    {
        return _ice_delegate.hashCode();
    }

    public void copyWithoutDuplicates(int[] inVector, IntVectorHolder outVector, Ice.Current __current)
    {
        _ice_delegate.copyWithoutDuplicates(inVector, outVector, __current);
    }

    public void sort(int[] inVector, IntVectorHolder outVector, Ice.Current __current)
    {
        _ice_delegate.sort(inVector, outVector, __current);
    }

    private _VectorManipulatorOperations _ice_delegate;

    public static final long serialVersionUID = -8951124206334108711L;
}