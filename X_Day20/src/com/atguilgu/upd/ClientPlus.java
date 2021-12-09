package com.atguilgu.upd;

import java.io.*;
import java.net.Socket;

public class ClientPlus {
    public static void main(String[] args) throws IOException {
        Socket client1 = new Socket("192.168.11.66",8080);
        OutputStream os = client1.getOutputStream();
        //先将客户端需要上传文件的文件全名传给服务器，包括后缀名
        File file = new File("E:\\课堂资料\\TB_Day01资料\\录屏\\01_上课前说明.mp4");
        String fileName = file.getName();
        os.write(fileName.getBytes());
        //用于将本地上传文件到客户端
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos = new BufferedOutputStream(os);
        byte[] bs = new byte[5120];
        int len;
        while((len = bis.read(bs))!=-1){
            //直接传到服务器
            bos.write(bs,0,len);
            bos.flush();
        }
        //上传完成，关闭输出流
        client1.shutdownOutput();
        //获取服务器的反馈消息
        InputStream inputStream = client1.getInputStream();
        byte[] fk = new byte[512];
        int fkLen = inputStream.read(fk);
        System.out.println(new String(fk,0,fkLen));


    }
}
