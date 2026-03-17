import java.io.*;
import java.net.*;

public class Myserv2 {

public static void main(String[] args){

try{

ServerSocket ss = new ServerSocket(6666);

Socket s = ss.accept();

DataInputStream dis = new DataInputStream(s.getInputStream());

// receive message
String str = dis.readUTF();

System.out.println("message = " + str);

ss.close();

}
catch(IOException e){
System.out.println(e);
}
}
}