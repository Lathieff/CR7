import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class ChatImpl extends UnicastRemoteObject implements ChatInterface {

protected ChatImpl() throws RemoteException {
super();
}

@Override
public String sendMessage(String message) throws RemoteException {

if(message.equalsIgnoreCase("hello"))
return "Server: Hi Client!";

else if(message.equalsIgnoreCase("how are you"))
return "Server: I am fine!";

else
return "Server received: " + message;
}
}