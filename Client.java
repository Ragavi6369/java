import java.io.*;
import java.net.*;
public class Client{
    public static void main(String[] args){
        try{
        Socket socket=new Socket("Localhost",5000);
        PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
        out.println("Hi server, this is client.I am one piece fan");
        BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String serverResponse=in.readLine();
        System.out.println("Server says:"+serverResponse);

        PrintWriter out1=new PrintWriter(socket.getOutputStream(),true);
        out1.println("Where we use java?");
        BufferedReader in1=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String serverResponse1=in1.readLine();
        System.out.println("Server says:"+serverResponse1);
       
        socket.close();
       
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}