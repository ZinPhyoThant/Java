package Java.daily.day2.oop.object;

public class ObjectEg {

    int num = 10;
    static String name= "Mg";

    public static void main(String[] args) {

        ObjectEg obj = new ObjectEg();
        System.out.println(obj.num);

        System.out.println(new ObjectEg().num);

        System.out.println(ObjectEg.name);


    }
}
