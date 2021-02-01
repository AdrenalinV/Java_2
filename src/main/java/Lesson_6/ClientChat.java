package Lesson_6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientChat {
    public static void main(String[] args) {
        try {
            try (Socket socket = new Socket("localhost", 8189)) {
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                DataInputStream in = new DataInputStream(socket.getInputStream());
                Ear clientEar = new Ear(in);
                Thread t = new Thread(clientEar);
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
                t.interrupt();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
