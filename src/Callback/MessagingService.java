package Callback;

import java.rmi.RemoteException;

public class MessagingService implements MessagingServiceIF {
    @Override
    public void sendMessage(Message message, CallbackIF callback) throws RemoteException {

        System.out.println(message.toString());

        callback.nachrichtZustellen(message, callback);

    }
}
