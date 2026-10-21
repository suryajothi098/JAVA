import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 5000);

            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            dos.writeUTF("Hello Server! This is Client.");
            dos.flush();

            dos.close();
            s.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
