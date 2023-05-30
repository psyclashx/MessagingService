package Callback;

import java.io.IOException;
import java.rmi.AlreadyBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {
    public static final String END_STRING = "ENDE";
    public static void main(String[] args) {



        try {
            MessagingServiceIF serverImpl = new MessagingService();



            Registry registry = LocateRegistry.createRegistry(1236);
            MessagingServiceIF skeleton = (MessagingServiceIF) UnicastRemoteObject.exportObject(serverImpl,0);
            registry.bind("Messaging-Service", skeleton);

            System.out.println("ByValue.Server running...");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            throw new RuntimeException(e);
        }

    }
}
