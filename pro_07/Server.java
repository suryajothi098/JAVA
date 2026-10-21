import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

    public static void main(String[] args) {

        try {

            AddImpl obj = new AddImpl();

            Registry registry = LocateRegistry.createRegistry(1099);

            registry.rebind("Addition", obj);

            System.out.println("Server is Ready...");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
