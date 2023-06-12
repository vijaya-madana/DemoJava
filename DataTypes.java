package com.basicjava;

public class DataTypes {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c;
        c = a +b;
        System.out.println("Integer is : " + c);
        float d = 67589.5f;
        System.out.println("Float value is :" + d);
        String ss = "vijaya";
        System.out.println("String value is : " + ss);
        long num = 7886678L;
        System.out.println("long value is : " + num);
        boolean isRaining = true;
        boolean hasPermission = false;
        if(isRaining){
            System.out.println("Remember to take ab umberella");
        }
        if (hasPermission) {
            System.out.println("access is granted");

        }else {
            System.out.println("access denied");
        };
        char name = 'V';

        System.out.println("Char value is : " + name);




    }
}

