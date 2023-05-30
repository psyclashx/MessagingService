package ByValue;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MessagingServiceIF extends Remote {

    public Message sendMessage(Message message) throws RemoteException;

}
