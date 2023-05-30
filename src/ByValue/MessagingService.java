package ByValue;

import java.rmi.RemoteException;

public class MessagingService implements MessagingServiceIF {
    @Override
    public Message sendMessage(Message message) throws RemoteException {

        System.out.println(message.toString());
        return message;

    }
}
