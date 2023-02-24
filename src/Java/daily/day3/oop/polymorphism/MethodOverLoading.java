package Java.daily.day3.oop.polymorphism;

public class MethodOverLoading {
    static void calculate(int num1,int num2){
        System.out.println(num1+num2);
    }

    static void calculate(int num3){
        System.out.println(num3+num3);
    }

    static void calculate(double num1,double num2, double num3){
        System.out.println(num1+num2+num3);
    }

    public static void main(String[] args) {
        calculate(1,2);
        calculate(1);
        calculate(1.2,1.3,1.4);

    }
}
