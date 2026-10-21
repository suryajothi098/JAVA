import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    public static void main(String[] args) {

        try {

            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            Add obj = (Add) registry.lookup("Addition");

            int result = obj.add(10, 20);

            System.out.println("Addition = " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
