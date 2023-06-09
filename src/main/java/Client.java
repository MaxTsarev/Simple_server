import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class Client {

    public static void main(String[] args) {

        try (Socket socket = new Socket(ServerConfig.HOST, ServerConfig.PORT);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        ) {

            System.out.println(in.readLine());

            out.println("Ivan");

            System.out.println(in.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
