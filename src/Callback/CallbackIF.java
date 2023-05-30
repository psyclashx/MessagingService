package Callback;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CallbackIF extends Remote {
    public void nachrichtZustellen(Message message, CallbackIF callback) throws RemoteException;
}
