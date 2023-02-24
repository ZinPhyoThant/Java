package Java.daily.day2.oop.method;

public class Method_Initialize {

    int id;
    String name;

    void insert(int id,String name){
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Method_Initialize obj = new Method_Initialize();

        obj.insert(1,"David");
        System.out.println(obj.id);
        System.out.println(obj.name);
    }
}
