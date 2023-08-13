package ru.otus.mike.learn.l_1.presentation;

public class MyFirstApplication {
    public static void main(String[] args) {
//        hello();
//        variablesDemo();
//        arithmeticDemo();
//        methodsDemo();
        ifDemo();
    }

    public static void hello() {
        System.out.println("Hello World");
    }

    public static void variablesDemo() {
        int temperature = 10;
        int bobAge = 24;
        float x;
        x = 21.12f;
    }

    public static void arithmeticDemo() {
        int val = 10;
        val++;
        // ==
        val += 1;

        val--;

        val += 10;
        val -= 10;
        val *= 10;
        val /= 10;
        val = 10;
    }

    public static void methodsDemo() {
        printHelloThreeTimes();
        sumAndPrint();
    }

    public static void printHelloThreeTimes() {
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
    }

    public static void sumAndPrint() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    public static void ifDemo() {
        int a = 10;
        int b = 20;
        int sum = a + b;

        if (a > 10) {
            System.out.println("The value of variable a is strictly greater than 10");
        }

        if (a != 10) {
            System.out.println("The value of variable a is not equal to 10");
        }

        if (sum >= 0) {
            System.out.println("The sum of a and b is greater than or equal to 0");
        }

        if (a == b) {
            System.out.println("The value of variable a is equal to the value of variable b");
        }
    }
}
