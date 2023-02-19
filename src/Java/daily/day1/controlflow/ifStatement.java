package Java.daily.day1.controlflow;

public class ifStatement {
    public static void main(String[] args) {
        int a =10;


        if (a>5){
            System.out.println(a + " is greater than 5.");
        } else if (a>20) {
            System.out.println(a + "is greater than 20");
        } else {
            System.out.println(a +" is less than 20");
        }

        int mark=50;
        if(mark >=40 && mark<80){
            System.out.println("Pass");
        } else if (mark >=80){
            System.out.println("D");
        } else
            System.out.println("Fail");
    }
}
