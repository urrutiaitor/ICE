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
// Generated from file `Voting.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package voting;

public abstract class Callback_Voter_vote
    extends IceInternal.TwowayCallback implements _Callback_Voter_vote
{
    public final void __completed(Ice.AsyncResult __result)
    {
        VoterPrxHelper.__vote_completed(this, __result);
    }
}
