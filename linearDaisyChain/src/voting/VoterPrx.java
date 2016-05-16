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

public interface VoterPrx extends Ice.ObjectPrx
{
    public int vote(int nVoters, VoteVectorHolder votes);

    public int vote(int nVoters, VoteVectorHolder votes, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_vote(int nVoters);

    public Ice.AsyncResult begin_vote(int nVoters, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_vote(int nVoters, Ice.Callback __cb);

    public Ice.AsyncResult begin_vote(int nVoters, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_vote(int nVoters, Callback_Voter_vote __cb);

    public Ice.AsyncResult begin_vote(int nVoters, java.util.Map<String, String> __ctx, Callback_Voter_vote __cb);

    public interface FunctionalCallback_Voter_vote_Response
    {
        void apply(int __ret, int[] votes);
    }

    public Ice.AsyncResult begin_vote(int nVoters, 
                                      FunctionalCallback_Voter_vote_Response __responseCb, 
                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_vote(int nVoters, 
                                      FunctionalCallback_Voter_vote_Response __responseCb, 
                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                      IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_vote(int nVoters, 
                                      java.util.Map<String, String> __ctx, 
                                      FunctionalCallback_Voter_vote_Response __responseCb, 
                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_vote(int nVoters, 
                                      java.util.Map<String, String> __ctx, 
                                      FunctionalCallback_Voter_vote_Response __responseCb, 
                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                      IceInternal.Functional_BoolCallback __sentCb);

    public int end_vote(VoteVectorHolder votes, Ice.AsyncResult __result);
}
