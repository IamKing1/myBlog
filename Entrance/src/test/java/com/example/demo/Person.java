package com.example.demo;

/**
 * @ClassName Person
 * @Description TODO
 * @Author admin
 * @Date 2020/5/22 13:48
 * @Version 1.0
 **/
public class Person {

    String name;
    public Person(String name) {
        this.name = name;
    }
    public void sayHello() {
        System.out.println("hello " + name);
    }
}
