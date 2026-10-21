import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("Server is waiting...");

            Socket s = ss.accept();
            System.out.println("Client Connected.");

            DataInputStream dis = new DataInputStream(s.getInputStream());

            String msg = dis.readUTF();
            System.out.println("Message from Client: " + msg);

            dis.close();
            s.close();
            ss.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
