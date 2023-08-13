package ru.otus.mike.learn.l_1;

public class MainApp {
    public static void main(String[] args) {
//        output();
//        variables();
//        drawBox();
        condition();
    }

    public static void output() {
        System.out.println("Hello World!");
        System.out.println(30.0f);
        System.out.println(1);
        System.out.println(2);
//        System.out.println(3);
        System.out.println("END"); // "" => String
        System.out.println('*');   // '' => Char
    }

    public static void variables() {
//        int a; // объявление переменной
//        a = 5; // инициализация переменной

        /*
            нельзя использовать неинициализированные локальные переменные
            err - java: variable a might not have been initialized
         */
//        System.out.println(a);

        int a = 10;
        int b = 4;
        int c = a + b;
        System.out.println(a);
        System.out.println(a + 4);
        System.out.println(c);
        System.out.println("a");
        System.out.println();

        int d = 10 / 3; // == 3
        System.out.println("10 / 3 = " + d);

        String str = "hello";
        System.out.println(str);
    }

    public static void drawBox() {
        System.out.println("--------");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("--------");
    }

    public static void condition() {
        int temperature = 30;

        if (temperature > 25) {
            System.out.println("should wear a t-shirt");
        }

        if (temperature == 0) {
            System.out.println("definitely wear a jacket");
        }

        if (temperature != 0) {
            System.out.println("exact temperature unknown");
        }

        if (temperature < -15) {
            System.out.println("should wear a fur-coat");
        }

        System.out.println("END");
    }
}
