package com.soc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class socServer {

    public static void main(String[] args) throws Exception {

        System.out.println("Server is started");
        ServerSocket ss = new ServerSocket(9999);

        System.out.println("Server is waiting for client request");
        Socket s = ss.accept();

        System.out.println("Client connected");
cd
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str = null;
        str = br.readLine();

        System.out.println("Client Data: " + str);
    }

}
