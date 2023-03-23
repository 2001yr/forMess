package com.itheima.edu.info.reStudy;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class saveOfIO {
    public static void main(String[] args)throws IOException {
        //需求：将键盘录入的用户名和密码保存到本地实现永久化存储
        //需求；用户名独占一行，密码独占一行
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = sc.next();
        System.out.println("请输入密码");
        String password = sc.next();

        FileWriter fw = new FileWriter("E:\\person.txt");
        fw.write(name);
        fw.write("\r\n");//换行
        fw.write(password);
        fw.flush();
        fw.close();
    }
}
