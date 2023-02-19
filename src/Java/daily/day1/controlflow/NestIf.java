package Java.daily.day1.controlflow;

public class NestIf {
    public static void main(String[] args) {
        int a=45;
        if(a>40){
            int b=10;
            if (b==a){
                System.out.println("a equal b.");
            }else if (b==2) {
                System.out.println();
            }else {
                System.out.println("b is nothing");
            }
            System.out.println("a is greater than 40");
        } else {
            System.out.println("a is less than 40");
        }
    }
}
