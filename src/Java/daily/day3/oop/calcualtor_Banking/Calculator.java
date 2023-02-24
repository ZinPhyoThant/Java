package Java.daily.day3.oop.calcualtor_Banking;

import java.util.Scanner;

public class Calculator {

    static void multiply(int num1,int num2){
        System.out.println(num1*num2);
    }

    static void divided(int num1,int num2){
        System.out.println(num1 / num2);
    }
    public static void main(String[] args) {
        System.out.print("Enter num1: ");
        int num1 = new Scanner(System.in).nextInt();
        System.out.print("Enter num2: ");
        int num2 = new Scanner(System.in).nextInt();
        System.out.print("Enter Operator \" + -\": ");
        String operator = new Scanner(System.in).nextLine();

        if (operator.equals("+")){
            System.out.println("This is add: "+(num1 + num2));
        } else if (operator.equals("-")) {
            System.out.println("This is odd: "+(num1 - num2));
        }else if (operator.equals("*")){
            multiply(num1,num2);
        } else if (operator.equals("/")){
            divided(num1,num2);
        }
        else
            System.out.println("Operator is wrong");
    }
}
