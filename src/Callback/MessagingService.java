package Callback;

import java.io.SyncFailedException;
import java.rmi.RemoteException;
import java.util.Random;

public class MessagingService implements MessagingServiceIF {
    @Override
    public void sendMessage(Message message, CallbackIF callback) throws RemoteException {


        Runnable serviceTast = new Runnable() {
            @Override
            public void run() {

                try {
                    System.out.println(message.toString());
                    System.out.println("/METHOD INVOCATION 'sendMessage' executed");

                    Thread.sleep(5000);

                    callback.nachrichtZustellen(message, callback);
                } catch (InterruptedException | RemoteException e) {
                    e.printStackTrace();
                }

            }
        };
        new Thread(serviceTast).start();
        return;



    }
}
