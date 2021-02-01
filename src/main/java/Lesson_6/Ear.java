package Lesson_6;

import java.io.DataInputStream;
import java.io.IOException;

public class Ear implements Runnable {
    private DataInputStream in;

    public Ear(DataInputStream in) {
        this.in = in;
    }

    @Override
    public void run() {
        String msg;
        while (true) {
            try {
                msg = in.readUTF();

                System.out.println("in: " + msg);
            } catch (IOException e) {
                break;
            }
        }
    }
}
