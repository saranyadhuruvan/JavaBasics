package com.study.javabasic;

public class ReferenceDatatypeExample {
    String str = "dhuruvan";
    Home saranyahome = new Home();
    int[] arr= new int[5];

    Home[] homes=new Home[5];

    public static void main(String[] args) {
        ReferenceDatatypeExample r= new ReferenceDatatypeExample();
        System.out.println(r.str);
        System.out.println(r.arr);
        System.out.println(r.saranyahome);
    }
}
