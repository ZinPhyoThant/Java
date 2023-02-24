package Java.daily.day2.oop.object;

class Student{
    int id;
    String name;
}

public class ObjectInit {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.id=1;
        student1.name="Mg";
        System.out.println(student1.id);
        System.out.println(student1.name);

        Student student2 = new Student();
        student2.id=2;
        student2.name="Hla";
        System.out.println(student2.id);
        System.out.println(student2.name);


        //Anonymous Object
        int a=3,b=4,c=5;
        System.out.println(new Student().id=3);
        System.out.println(new Student().name="Aung");

        Student student3= new Student(), student4 = new Student();


    }
}
