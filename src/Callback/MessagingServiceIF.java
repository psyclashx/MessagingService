package Callback;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MessagingServiceIF extends Remote {

    public void sendMessage(Message message, CallbackIF callback) throws RemoteException;

}
