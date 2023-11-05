package com.soc;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class socClient {

public static void main(String[] args) throws Exception{

    String ip = "localhost";
    int port = 9999;// 0-1023 to 65535
    Socket s = new Socket(ip,port);

    String str = "Hello World";

    OutputStreamWriter os = newOutputStreamWriter(s.getOutputStream());

    PrintWriter out = new PrintWriter(os);
    os.write(str);
    os.flush(); 
}