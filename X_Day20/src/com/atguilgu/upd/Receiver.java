package com.atguilgu.upd;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
    DatagramSocket(int port)

    接收端数据报包对象创建:
        DatagramPacket(byte[] buf, int offset, int length)

    拆快递的方法:
        byte[] getData():获取数据包中的数据 --> 废物
        int getLength():发送过来的数据长度 字节个数
        InetAddress getAddress():获取发件人的ip地址对象
 */
public class Receiver {
    public static void main(String[] args) throws IOException {
        try {
            //创建接收端对象
            DatagramSocket ds = new DatagramSocket(10010);
            while(true){
                byte[] bys = new byte[1024];
                //接收端需要的数据包对象
                DatagramPacket p = new DatagramPacket(bys,0,bys.length);
                //接受
                ds.receive(p);//阻塞

                //拆快递
                int length = p.getLength();//数据长度
                //把数据转成字符串
                String line = new String(bys, 0, length);
                InetAddress address = p.getAddress();
                String hostName = address.getHostName();
                String hostAddress = address.getHostAddress();
                System.out.println("发件人:"+hostName);
                System.out.println("发件人地址:"+hostAddress);
                System.out.println("发件内容:"+line);
                System.out.println("-----------------------");
            }
            //关闭资源
            //ds.close();
        } catch (IOException e) {
            System.out.println("你的程序有问题,接受失败~");
        }
    }
}
