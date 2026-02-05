import java.io.*;
import java.net.*;
public class Server{
    public static void main(String[] args){
        try{
            ServerSocket serverSocket=new ServerSocket(5000);
            System.out.println("Server is waiting for client.");

            Socket socket=serverSocket.accept();
            System.out.println("Client connected");

            BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String clientMessage=in.readLine();
            System.out.println("Client says:" +clientMessage);

            PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
            out.println("Hello from server!.I am java fan");
            
            

            BufferedReader in1=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String clientMessage1=in1.readLine();
            System.out.println("Client says:" +clientMessage1);

            PrintWriter out1=new PrintWriter(socket.getOutputStream(),true);
            out1.println("Jave is used in web development,mobile apps,etc.,");
            socket.close();
            serverSocket.close();
            
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}