package com.itheima.edu.info.reStudy;

public class changeNumber {
    public static void main(String[] args) {
        System.out.println(sum(10,20,30));

    }
    public static int sum(int ...a){
        int sum = 0;
        for (int i:a){//拿到每项的值
            sum+=i;//sum=i+sum
        }
        return sum;
    }
}
