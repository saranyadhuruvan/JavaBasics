package com.study.javabasic;

public class CheckAccessModifer {

    public static void main(String[] args) {
       ModifierExample me= new ModifierExample();

        System.out.println(me.age);
        System.out.println(me.childAge);
        System.out.println(me.EmpId);
        System.out.println("Hi");

        Child ch= new Child();

    }
}
