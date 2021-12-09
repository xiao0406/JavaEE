package com.atguilgu.upd;

import java.io.IOException;
import java.net.*;

public class Sender {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        byte[] bys = "Hello".getBytes();
        InetAddress loc = InetAddress.getLocalHost();
        int port = 10010;
        DatagramPacket p = new DatagramPacket(bys,0,bys.length,loc,port);
        ds.send(p);
        ds.close();

    }
}
