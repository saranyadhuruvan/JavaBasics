package com.study.javabasic;

public class ContrcutorExample {

    int i;

    String str;

    public ContrcutorExample(){
        i=10;
        str="Default name";
    }

    public static void main(String[] args) {
        ContrcutorExample ex = new ContrcutorExample();
        System.out.println(ex.i);
        System.out.println(ex.str);
    }
}
