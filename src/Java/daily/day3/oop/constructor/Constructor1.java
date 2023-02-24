package Java.daily.day3.oop.constructor;

public class Constructor1 {
    int i;
    String name;

//    public Constructor1(int i, String name) {
//        this.i = i;
//        this.name = name;
//    }

    Constructor1(){
        System.out.println("Constr is working");
    }

    public static void main(String[] args) {
//        new Constructor1(1,"mg");
new Constructor1();
    }
}
