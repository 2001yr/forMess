package com.itheima.edu.info.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server  {
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(8888);
         Socket socket =ss.accept();
         //接下来由客户端进行输入流，首先启动输入...
         InputStream in = socket.getInputStream();
         //后开始读取数据
        int len;
        byte[] b = new byte[1024];
        while ((len=in.read(b)) !=-1){
            System.out.println(new String(b,0,len));
        }
        ss.close();
        in.close();
    }
}
//一.在项目下创建TCP 服务器端 端口号为8888
//1:等待客户端连接   如果有客户端连接  获取到客户端对象
//2:获取到客户端对象之后 当前在服务器读取数据客户端传送数据
