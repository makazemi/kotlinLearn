package com.example.kotlinlearn;

public class MyJavaFile {

    public static void main(String[] args){
        int sum=MyfirstfileKt.addTwoNumber(3,4);
        System.out.println("Printing sum from java file: "+sum);
    }

    public static int getArea(int l,int b){
        return l*b;
    }
}
