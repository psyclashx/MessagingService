package Callback;

import javax.security.auth.callback.Callback;
import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try {

            Registry registry = LocateRegistry.getRegistry("localhost", 1236);
            MessagingServiceIF stub = (MessagingServiceIF) registry.lookup("Messaging-Service");
            System.out.println("Connected!");

            String streamIo;

            do {
                Scanner sc = new Scanner(System.in);
                int x;
                streamIo = sc.nextLine();

                Message message = new Message();
                message.setMessageContent(streamIo);
                message.setDatum(new Date());

                CallbackIF callbackIF = new CallbackEmpfaenger();
                CallbackIF callbackStub = (CallbackIF) UnicastRemoteObject.exportObject(callbackIF, 0);

                stub.sendMessage(message, callbackStub);



            }while(streamIo != null && !streamIo.equalsIgnoreCase(Server.END_STRING));



        } catch (IOException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            throw new RuntimeException(e);
        }
    }
}
