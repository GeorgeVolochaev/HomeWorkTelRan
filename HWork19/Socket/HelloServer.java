package socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;

/**
 * Java homework19
 * @author
 * @version 1   24.08.2022
 *
 */

public class HelloServer {
    public static void main(String[] args) {
        new HelloServer();
    }

    HelloServer() {
        try (var server = new ServerSocket(2048)) {
            System.out.println("Server started...");
            while (true){
                  var socket = server.accept();
                  var writer = new PrintWriter(socket.getOutputStream());
                  writer.println("Server says: Hello");
                  System.out.println("Message sent to client.");
                  writer.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}


