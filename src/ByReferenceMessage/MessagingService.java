package ByReferenceMessage;

import java.rmi.RemoteException;

public class MessagingService implements MessagingServiceIF {
    @Override
    public MessageIF sendMessage(MessageIF message) throws RemoteException {

        System.out.println(message.toString());
        return message;

    }
}
