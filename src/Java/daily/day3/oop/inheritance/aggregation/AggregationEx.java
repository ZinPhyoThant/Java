package Java.daily.day3.oop.inheritance.aggregation;

public class AggregationEx {
    String name;
    int age;
    Locaiton locaiton;

    public AggregationEx(String name, int age, Locaiton location1) {
        this.name = name;
        this.age = age;
        this.locaiton=location1;
    }

    void show(){
        System.out.println("Name is "+ name+ "\nAge is "+ age+ "\nCity is "+ locaiton.cityName+ "\nStreetName is "+ locaiton.streetName+ "\nhouse No is "+ locaiton.homeNo);
    }
    public static void main(String[] args) {
        Locaiton local =new Locaiton("Ygn","Zarti",1);
        AggregationEx user1 = new AggregationEx("Mg",40,local);
        user1.show();
    }
}
