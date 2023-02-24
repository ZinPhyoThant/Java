package Java.daily.day3.oop.inheritance;


class Parent{
    String name;
    int age;

    void pshow(){
        System.out.println("This is Pshow");
    }
}

class Child extends Parent{
    String work;
    void cshow(){
        System.out.println("This is Cshow");
    }
}




public class Inheritance {
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p.age=40);
        System.out.println(p.name = "U Ba");
        p.pshow();
        // p. work can't work ushould type p.

        Child c = new Child();
        System.out.println(c.name = "Mg");
        System.out.println(c.age = 11);
        System.out.println(c.work = "Student");
        c.pshow();
        c.cshow();
    }
}
