package com.itheima.edu.info.reStudy;

public class grades implements Comparable<grades>{
    private String name;
    private int chinese;
    private int math;
    private int english;

    public grades() {
    }

    public grades(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }
    public int getSum(){
        return this.chinese + this.getEnglish() + this.math;
    }
    public int compareTo(grades o){
        //主要条件:按照总分排序
       int result =  o.getSum() - this.getSum();
       //次要条件:总分一样，就按照语文成绩排序
        result = result==0? o.getChinese() - this.getChinese():result;
        //如果语文成绩也一样，就按照数学成绩排序
        result = result==0? o.getMath() - this.getMath():result;
        return result;
    }
}
