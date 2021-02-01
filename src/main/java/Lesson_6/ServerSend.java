package Lesson_6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSend {
    public static void main(String[] args) {
        try {
            ServerSocket socketServer = new ServerSocket(8189);
            System.out.println("Server run: Ok");
            Socket socket = socketServer.accept();
            System.out.println("Client connect: Ok");
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            DataInputStream in = new DataInputStream(socket.getInputStream());
            Ear serverEar = new Ear(in);
            Thread t = new Thread(serverEar);
            t.start();
            Scanner sc = new Scanner(System.in);
            String msg;
            while (true) {
                msg = sc.nextLine();
                if (msg.equals("exit")) {
                    break;
                }
                out.writeUTF(msg);
                out.flush();
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
