package lesson1;

import java.util.Scanner;
//1.
public class homeWork {
    public static void main(String[] args) {
        System.out.println("I'm doing my homework");
        System.out.println("Сложнее было разобраться с GitHub");
//2.
        String name = "Vitaly";
        byte age = 34;
        short weight = 89;
        int height = 174;
        long phoneNumber = 123456789;
        double medInsCoast = 12345.55;
        float carInsCoast = 12345.67f;
        char level = '1';
        boolean male = true;
//3.
        evalExp(1, 2, 3, 4);

//4.
        amount(5, 10);
//5.
        whatNumber(5);
//6.
        posNegNumber(-8);
//7.
        greeting("Джон");
//8.
        leapYear();
    }
    //3.
    static int evalExp(int a, int b, int c, int d){

        return a * (b + (c / d));
    }
    //4.
    static boolean amount(int a, int b) {

        return a + b >= 10 && a + b <= 20;
    }
    //5.
    static void whatNumber(int a){
        if (a >= 0)
            System.out.println("Это положительное число");
        else
            System.out.println("Это отрицательное число");
    }
    //6.
    static boolean posNegNumber(int a){
        return a < 0;
    }
    //7.
    static void greeting(String name){
        System.out.println("Привет, " + name + "!");
    }
    //8.
    static void leapYear(){
        System.out.println("Введите год");
        Scanner keyboard = new Scanner(System.in);
        int inputYear = keyboard.nextInt();
        if(inputYear % 4 != 0)
            System.out.println(inputYear + " - обычный год");
        else if (inputYear % 100 == 0 && inputYear % 400 != 0)
            System.out.println(inputYear + " - обычный год");
        else
            System.out.println(inputYear + " - високосный год");
    }
}