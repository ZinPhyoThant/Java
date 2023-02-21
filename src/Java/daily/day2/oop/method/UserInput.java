package Java.daily.day2.oop.method;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

//        System.out.print("Enter Your Name: ");
//        Scanner sc = new Scanner(System.in);
//        String name =sc.nextLine();
//        System.out.println("My Name is "+name);

        System.out.print("Enter Your Password: ");
        Scanner sc = new Scanner(System.in);
        String pwd=sc.nextLine();
        if (pwd=="Pwd"){
            System.out.println("this pwd is true");
        } else
            System.out.println("invalid");

        System.out.println(pwd.length());






    }

}
