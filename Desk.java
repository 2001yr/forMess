package Multithread;

public class Desk{
    //桌子有两种状态，有/无 --若有--数量不能超过10
    //ture表示桌上有汉堡，此时允许吃货执行
    //false表示桌上没有食物，此时允许厨师执行,一开始桌上是没有食物的 所以未false
    //一开始先设汉堡数量为10
    public static boolean flag = false;
    public static int count = 10;
    public static final Object lock = new Object();

    }
