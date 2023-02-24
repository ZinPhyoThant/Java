package Java.daily.day1.array;

public class CustomArrayCopy {
    public static void main(String[] args) {
        int num [] = {1,1,2,2,3,4,5,6,7,8};

        int copy[] = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            copy[i]=num[i];
        }

        for (int i = 0; i <copy.length ; i++) {
            System.out.print(copy[i] + "\t");
        }
        System.out.println();

        //Largest Number
        int largest=0;
        for (int i=0;i<num.length;i++){
            if(num[i]>largest){
                largest=num[i];
            }

        }
        System.out.println(largest);


        //Sorting
        int value=0;
        int num1 [] = {4,1,3,2,6,5,9,7,8};

        for (int i=0;i<num1.length;i++){
            for (int j=i+1;j<num1.length;j++){
                if (num1[i]>num1[j]) {
                    value = num1[i];
                    num1[i] = num1[j];
                    num1[j] = value;
                }
            }
        }
        for (int i = 0; i <num1.length ; i++) {
            System.out.print(num1[i] + "\t");
        }
    }
}
