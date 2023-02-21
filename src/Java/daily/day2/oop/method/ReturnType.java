package Java.daily.day2.oop.method;

public class ReturnType {

    static void name(){
        System.out.println("This is name");
    }

    void name1(){
        System.out.println("This is name1");
    }

    void sum(int num1,int num2){
        System.out.println(num1+num2);
    }

    int multiple (int num1,int num2){
    return num1*num2;
    }

    String name2(){
        return "Mg";
    }

    int num (int num1,int num2){
        return num1+num2;
    }

    public static void main(String[] args) {

        ReturnType.name();

        ReturnType returnType = new ReturnType();
        returnType.name1();

        returnType.name1();

        System.out.println(returnType.multiple(2, 4));

        String str = returnType.name2();

        int sum = returnType.num(1,2);
        System.out.println(sum);


    }
}
