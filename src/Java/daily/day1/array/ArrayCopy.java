package Java.daily.day1.array;

public class ArrayCopy {
    public static void main(String[] args) {
        int numbers[] = new int[7];
        numbers[1] =1;

        for (int i = 0; i < 1; i++) {
        for (int i1=0;i1<numbers.length;i1++){
            System.out.print(numbers[i]=i1);
        }
        }
        System.out.println();

        int num [] = {1,2,3,4,5,6,7,8};

        //Clone
        int onum[] = num.clone();
        for (int i=0;i<onum.length;i++){
            System.out.print(onum[i]);
        }
        System.out.println();

        //Copy
        int other[] = new int[7];
        System.arraycopy(num,0,other,0,7);

        for (int i=0;i<other.length;i++){
            System.out.print(other[i]);
        }



    }
}

