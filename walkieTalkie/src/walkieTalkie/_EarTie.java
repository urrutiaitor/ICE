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
// Generated from file `WalkieTalkieEar.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package walkieTalkie;

public class _EarTie extends _EarDisp implements Ice.TieBase
{
    public _EarTie()
    {
    }

    public _EarTie(_EarOperations delegate)
    {
        _ice_delegate = delegate;
    }

    public java.lang.Object ice_delegate()
    {
        return _ice_delegate;
    }

    public void ice_delegate(java.lang.Object delegate)
    {
        _ice_delegate = (_EarOperations)delegate;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        if(!(rhs instanceof _EarTie))
        {
            return false;
        }

        return _ice_delegate.equals(((_EarTie)rhs)._ice_delegate);
    }

    public int hashCode()
    {
        return _ice_delegate.hashCode();
    }

    public void pushMesssage(String msg, Ice.Current __current)
    {
        _ice_delegate.pushMesssage(msg, __current);
    }

    private _EarOperations _ice_delegate;

    public static final long serialVersionUID = 7995201754306387752L;
}