package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
/**
 * Java homework19
 * @author
 * @version 1   24.08.2022
 *
 */

public class HelloClient {
    public static void main(String[] args) {
        new HelloClient();
    }

    HelloClient() {
        try (var socket = new Socket("127.0.0.1",2048)) {
            var reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(reader.readLine());

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
