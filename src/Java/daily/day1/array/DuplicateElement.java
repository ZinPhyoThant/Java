package Java.daily.day1.array;

public class DuplicateElement {
    public static void main(String[] args) {
        int numbers[] = {1,1,2,3,3,4,5,5,6,7,8,9,9};

        for (int i=0;i<numbers.length;i++){
            for (int j=i+1;j<numbers.length;j++){
                if (numbers[i]==numbers[j]){
                    System.out.print(numbers[j] +"\t");
                }
            }
        }
    }
}
