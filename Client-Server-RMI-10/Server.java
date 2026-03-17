import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {

public static void main(String[] args) {

try {
LocateRegistry.createRegistry(1099);

ChatImpl obj = new ChatImpl();

Naming.rebind("rmi://localhost/ChatService", obj);

System.out.println("Chat RMI server started...");
}
catch(Exception e){
System.out.println(e);
}
}
}