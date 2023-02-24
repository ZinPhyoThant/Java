package Java.daily.day2.oop.method;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();
        System.out.println("My name is " + name);

        System.out.print("Enter Num: ");
        int num = scanner.nextInt();
        if (num%2 == 0){
            System.out.print("This is even");
        } else
            System.out.println("This is odd");

        String str = scanner.nextLine();
        if (str == "password"){
            System.out.println("password");
        } else
            System.out.println(str=="password");
            System.out.println(str);

        System.out.println(name.length());

    }

}
