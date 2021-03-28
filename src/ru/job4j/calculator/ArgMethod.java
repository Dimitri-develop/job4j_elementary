package ru.job4j.calculator;

public class ArgMethod {
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + "\nand I am " + age + " years old.");
    }

    public static void main(String[] args) {
        String name = "Dima Yamanko";
        int age = 31;


       // ArgMethod.hello();
        ArgMethod.hello(name, age);
//        ArgMethod.hello(age, age);
//        ArgMethod.hello(name, name, name);
    }
}
