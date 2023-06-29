package com.study.javabasic;

public class Home {

    float frontDoLen =10.2f;
    float width;
    int lenOne;
    double lenTwo=12.134;
    double lenThere;
    boolean isConstructor = true;
    char homeName='s';

    public void bedRoom()
    {
        System.out.println("Insite bedroom");
    }

    public int checkLights() {
        if(isConstructor)
        {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Home h = new Home();
        System.out.println(h.frontDoLen);
        System.out.println(h.isConstructor);
        System.out.println(h.lenOne);
        System.out.println(h.lenTwo);
        System.out.println(h.lenThere);
        System.out.println(h.width);
        System.out.println(h.homeName);
        h.bedRoom();
        System.out.println(h.checkLights());
        System.out.println("*******************Home 2 Objects********************");
        Home h1= new Home();
        h1.frontDoLen=11.2f;
        h1.isConstructor=false;
        System.out.println(h1.frontDoLen);
        System.out.println(h1.isConstructor);
        System.out.println(h1.lenOne);
        System.out.println(h1.lenTwo);
        System.out.println(h1.lenThere);
        System.out.println(h1.width);
        System.out.println(h1.homeName);
        h1.bedRoom();
        System.out.println(h1.checkLights());
    }

}
