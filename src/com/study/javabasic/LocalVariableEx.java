package com.study.javabasic;

public class LocalVariableEx {

    boolean isEven;
    public boolean checkEvenOrOdd(int a,int b){

        int sum=a+b;
        int mod=sum%2;

        if(mod==0)
            isEven =true;

       return isEven;
    }

    public void checkValue(){
        System.out.println(isEven);
    }

    public static void main(String[] args) {
        LocalVariableEx l= new LocalVariableEx();
        l.checkValue();
        boolean isEven=l.checkEvenOrOdd(2,2);
        System.out.println(isEven);
        l.checkValue();

    }
}
