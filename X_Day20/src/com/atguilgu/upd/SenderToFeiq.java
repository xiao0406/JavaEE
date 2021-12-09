package com.atguilgu.upd;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
/*
    version:time:sender:ip:flag:content; 版本：时间：发送者：IP : 标识 ：内容；
 */
public class SenderToFeiq {
    public static void main(String[] args) throws IOException {
        //创建对象
        DatagramSocket ds = new DatagramSocket();
        //数据进行编辑
        String message = getMessage("hello");
        //byte[] buf
        byte[] bys = message.getBytes("GBK");
        //InetAddress address
        //发给我自己
        InetAddress localHost = InetAddress.getByName("192.168.11.255");
        //int port
        int port = 2425;
        //创建数据包对象
        DatagramPacket p = new DatagramPacket(bys, 0, bys.length, localHost, port);
        //发送数据 send
        ds.send(p);

        //关闭资源
        ds.close();
    }

    public static String getMessage(String str){
        //version:time:sender:ip:flag:content; 版本：时间：发送者：IP : 标识 ：内容；
        StringBuilder sb = new StringBuilder();
        sb.append("1:").append(System.currentTimeMillis()).append(":").
                append("X:").append("110.110.110.110:").
                append("32:").append(str);
        return sb+"";
    }
}
