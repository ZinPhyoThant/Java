package Java.daily.day3.oop.constructor;

public class Constructor {

    Constructor(){
        System.out.println("This is working");
    }
    public static void main(String[] args) {
        Constructor obj= new Constructor();
        System.out.println(obj.toString());

        new Constructor();
    }
}
