package ByReferenceMessage;

import jdk.jshell.execution.RemoteExecutionControl;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

public interface MessageIF extends Remote {

    public String getMessageContent() throws RemoteException;
    public Date getDatum() throws RemoteException;

}
