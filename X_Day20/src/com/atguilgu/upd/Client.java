package com.atguilgu.upd;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.11.88",10001);
        OutputStream os = s.getOutputStream();
        os.write("Hello".getBytes());
        s.close();
    }
}
