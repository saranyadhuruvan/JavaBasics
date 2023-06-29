package com.study.javabasic;

public class ConstructorExampleWithCustomDefaultValues {

    String name;

    int age;

    public ConstructorExampleWithCustomDefaultValues(int dage,String dname )
    {
        name=dname;
        age=dage;
    }
    public static void main(String[] args) {

        ConstructorExampleWithCustomDefaultValues c1=new ConstructorExampleWithCustomDefaultValues(1,"name1");
        System.out.println("Age is "+c1.age+" and name is "+c1.name);
    }
}
