package com.itheima.edu.info.SortDemo;

public class Demo2 {
    public static void main(String[] args) {
        int num = factorial(10);
        System.out.println(num);
    }
    public static int factorial(int n){
        if ( n==0 || n==1) {
            return 1;
        }
        return n*factorial(n-1); //切记不是n*(n-1)
    }
}
/*##[题目二]
一个正整数的阶乘（factorial）是所有小于及等于该数的正整数的积，并且0的阶乘为1。
即：n的阶乘 = 1 * 2 * 3 * 4 * ... * n。
请使用递归知识，求10的阶乘是多少。


##【训练目标】：
能够使用递归编程
##【思路分析】：
1、使用递归实现，需要定义方法，方法的参数列表和返回值分别是什么？
2、使用递归需要找到问题分解的规律和递归的出口，在这个案例中，规律和出口分别是什么？

##【参考步骤】：
1、定义方法，参数列表是int n（表示求n的阶乘），返回值类型int或者long（表示n的阶乘的值）
2、递归的规律是n的阶乘等于n乘以n-1的阶乘，出口是0的阶乘已知为1。所以，判断如果n是0，返回1，否则返回n乘以n-1的阶乘。
3、在主方法中调用方法，查看结果。
 */