package com.itheima.edu.info.SortDemo;

public class Demo1 {
    public static void main(String[] args) {
        int num = fibonacci(20);
        System.out.println(num);
    }

    public static int fibonacci(int n) {  //定义方法
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}

/*[题目一]
斐波那契数列（fibonacci）是指这样一个数列：1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...
这个数列从第3项开始，每一项都等于前两项之和。请使用递归知识，求数列第20项的值。

##【训练目标】：
能够使用递归编程
##【思路分析】：
1、使用递归实现，需要定义方法，方法的参数列表和返回值分别是什么？
2、使用递归需要找到问题分解的规律和递归的出口，在这个案例中，规律和出口分别是什么？
##【参考步骤】：
1、定义方法，参数列表是int n（表示第n项），返回值类型int（表示第n项的值）
2、递归的规律是第n项的值等于第n-1项和第n-2项的和，出口是第1和第2项已知。所以，判断如果n是1或者2，返回1，否则返回第n-1项 + 第n-2项。
3、在主方法中调用方法，查看结果。

 */
