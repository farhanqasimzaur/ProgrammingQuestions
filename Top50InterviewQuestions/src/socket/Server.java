package socket;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private Socket socket = null;
	private ServerSocket serverSocket = null;
	private DataInputStream in = null;
	
	public Server(int port) {
		try {
			serverSocket = new ServerSocket(port);
			
			System.out.println("Server Started");
			
			System.out.println("Waiting for client");
			
			socket = serverSocket.accept();
			
			in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
			
			String line = "";
			
			while (!line.equals("Over")) 
            { 
                try
                { 
                    line = in.readUTF(); 
                    System.out.println(line); 
  
                } 
                catch(IOException i) 
                { 
                    System.out.println(i); 
                } 
            } 
            System.out.println("Closing connection"); 
  
            // close connection 
            socket.close(); 
            in.close(); 
			
		}catch(IOException io) {
			io.printStackTrace();
		}
	}
	
	public static void main(String args[]) {
		Server server = new Server(5000);
	}
	
}
