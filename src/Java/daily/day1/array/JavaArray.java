package Java.daily.day1.array;

public class JavaArray {
    public static void main(String[] args) {
        int a =60;
        String name ="Zin";

        String names[] = new String[5]; // array declare
        names[0] ="Mg";
        names[1] ="Aung";
        names[2] ="Hla";
        names[3] ="Mya";
        names[4] ="Ha";
        System.out.println(names);

        for (int i1=0;i1<names.length;i1++){
            System.out.print(names[i1] + "\t");
        }
        System.out.println();

        int numbers[] = {1,2,3,4,5}; //array inilialize
        System.out.println(numbers[2]);
        System.out.println(numbers);
        for (int i=numbers.length-1;i>=0;i--){
            System.out.print(numbers[i]+"\t");
        }
        System.out.println();


    }
}
