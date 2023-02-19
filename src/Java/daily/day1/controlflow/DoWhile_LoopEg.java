package Java.daily.day1.controlflow;

public class DoWhile_LoopEg {
    public static void main(String[] args) {

        //while loop
        System.out.println("This is While Loop.");
        int a=1;
        while(a<20){
            System.out.print(a+"\t");
            a++;
        }
        System.out.println();
        while(a>20){
            System.out.println(a+"\t");
            a--;
        }
        System.out.println();

        //Do While Loop
        System.out.println("This is do while loop");
        int b=10;
        do{
            System.out.print(b + "\t");
            b+=2;
        }while(b<30);
        System.out.println();
        do{
            System.out.println(b+"\t");
            b-=2;
        }while(b<1);


    }
}
