package net.Demo01TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        serverSocket.accept();

    }
}
