import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        String host = "127.0.0.1"; // Localhost
        int port = 65432;          // Port of the server

        try (Socket socket = new Socket(host, port)) {
            System.out.println("Connected to the server");

            // Input and output streams for communication
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            // Read user input
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            // Communication loop
            String serverMessage;
            while (true) {
                System.out.print("Client: ");
                String clientMessage = userInput.readLine();
                output.println(clientMessage);

                if ("exit".equalsIgnoreCase(clientMessage)) {
                    System.out.println("Connection closed.");
                    break;
                }

                serverMessage = input.readLine();
                System.out.println("Server: " + serverMessage);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

