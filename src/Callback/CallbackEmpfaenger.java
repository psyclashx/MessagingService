package Callback;

import java.rmi.RemoteException;

public class CallbackEmpfaenger implements CallbackIF {
    @Override
    public void nachrichtZustellen(Message message, CallbackIF callback) throws RemoteException {
        System.out.println(message);
    }
}
