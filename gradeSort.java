package com.itheima.edu.info.reStudy;

import java.util.TreeSet;

public class gradeSort {
    public static void main(String[] args) {
        TreeSet<grades>ts = new TreeSet<grades>();
        grades g1 = new grades("jack",80,40,100);
        grades g2 = new grades("rose",110,80,110);
        grades g3 = new grades("sam",90,70,100);
        ts.add(g1);
        ts.add(g2);
        ts.add(g3);
        for (grades i:ts){
            System.out.println(i.getName() + "," + i.getChinese() + "," + i.getMath() + "," + i.getEnglish() + "," + i.getSum());
        }
    }
}
