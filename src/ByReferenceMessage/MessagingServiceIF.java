package ByReferenceMessage;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MessagingServiceIF extends Remote {

    public MessageIF sendMessage(MessageIF message) throws RemoteException;

}
