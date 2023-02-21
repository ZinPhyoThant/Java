package Java.daily.day2.oop.method;

public class Method {
    static void eat (){
        System.out.println("Eating is Eating");
    }

    void sit(){
        System.out.println("Sitting is Sitting");
    }

    void add(){
        int a=1;
        int b=2;
        System.out.println(a+b);
    }

    void multipy(int num1,int num2){ //int num1,num2 is parameter
        System.out.println(num1*num2);
    }

    public static void main(String[] args) {
        eat();

        Method method = new Method();
        method.sit();

        method.add();

        method.multipy(4,2); //Argument




    }
}
