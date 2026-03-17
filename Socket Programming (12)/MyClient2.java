import java.io.*;
import java.net.*;

public class MyClient2 {

public static void main(String[] args){

try{

Socket s = new Socket("localhost", 6666);

DataOutputStream dout = new DataOutputStream(s.getOutputStream());

// send message
dout.writeUTF("Hello server");

dout.flush();
dout.close();
s.close();

}
catch(IOException e){
System.out.println(e);
}
}
}