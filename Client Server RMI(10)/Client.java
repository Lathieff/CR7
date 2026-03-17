import java.rmi.Naming;
import java.util.Scanner;

public class Client {

public static void main(String[] args) {

try {
ChatInterface obj = (ChatInterface) Naming.lookup("rmi://localhost/ChatService");

Scanner sc = new Scanner(System.in);

while(true){

System.out.println("Enter message (type exit to stop):");
String msg = sc.nextLine();

if(msg.equalsIgnoreCase("exit"))
break;

String response = obj.sendMessage(msg);

System.out.println(response);
}
}
catch(Exception e){
System.out.println(e);
}
}
}