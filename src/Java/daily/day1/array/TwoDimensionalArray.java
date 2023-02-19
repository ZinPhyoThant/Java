package Java.daily.day1.array;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        int dnumbers[][] = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15}
        };
        dnumbers[2][1] = 16;
        System.out.println(dnumbers[2][1] + " this is row 2 col 3 changed.");
        System.out.println(dnumbers.length + " this is row of dnumbers");
        System.out.println(dnumbers[1].length + " this is colum dnumbers in row 1");
        System.out.println(dnumbers[1] + " this is object of row 1");

        for (int row = 0; row < dnumbers.length; row++) {
            for (int col = 0; col < dnumbers[row].length; col++) {
                System.out.print(dnumbers[row][col] + "\t");
            }
            System.out.println();
        }


        for (int i =0; i < dnumbers[1].length; i++) {
            System.out.print(dnumbers[1][i] + "\t");
        }
        System.out.println();
        System.out.println( "this i foreach array output");
        for (int []num:dnumbers
             ) {
            for (int num1:num
                 ) {
                System.out.print(num1 +"\t");
            }
            System.out.println();
        }
    }
    }
