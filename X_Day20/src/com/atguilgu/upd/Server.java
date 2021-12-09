package com.atguilgu.upd;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10001);
        Socket accept = ss.accept();
        InputStream in = accept.getInputStream();
        byte[] bys = new byte[1024];
        int len = in.read(bys);
        InetAddress inetAddress = accept.getInetAddress();
        System.out.println("发件人地址:"+inetAddress.getHostAddress());
        System.out.println("发件人:"+inetAddress.getHostName());
        String line = new String(bys,0,len);
        System.out.println("line = " + line);
    }
}
