package ByReferenceMessage;

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

                MessageIF messageStub = (MessageIF) UnicastRemoteObject.exportObject(message,0);
                stub.sendMessage(messageStub);
                System.out.println("Sent ByValue.Message: " + message.toString());
                System.out.println("");

            }while(streamIo != null && !streamIo.equalsIgnoreCase(Server.END_STRING));



        } catch (IOException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            throw new RuntimeException(e);
        }
    }
}
