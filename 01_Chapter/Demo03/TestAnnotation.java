package com.qf.chapter1.demo; //包名全小写

/**
 * 文档注释 这个类旨在介绍JAVA中注释的方法有哪些
 */
public class TestAnnotation{//HelloWorld(pascal)->类名  helloWorld(camel)->函数，变量名 HELLO_WORLD ->常量名
     /**
      * 这个方法代表程序的入口，即为书写逻辑代码的位置
      */
    public static void main(String[] args){
        //以下
        System.out.print("Hello World");
        /* 
        多行注释的开始
        多行注释的结束
        */
        System.out.print("Hello Everyone");
    }
}