package B2_MangVaPhuongThucTrongJava.BaiTap;

import java.util.Random;
import java.util.Scanner;

public class TimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        int[][] array= createTwoDimensionalArray();
        displayTwoDimensionalArray(array);
        System.out.println("Max of the Two Dimensional Array :"+searchElementOfTwoDimensionalArray(array));

    }
    public static int[][] createTwoDimensionalArray(){
        int column;
        int row;
        Scanner scanner= new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Enter the number column of array : ");
        column=scanner.nextInt();
        System.out.print("Enter the number row of array: ");
        row= scanner.nextInt();
        int[][] array = new int[row][column];
        for (int i=0;i<array.length;i++){
            for (int j=0; j< array[0].length;j++){
                array[i][j]=rd.nextInt(1000);
            }
        }
        return array;
    }
    public static int searchElementOfTwoDimensionalArray(int[][] array){
        int max=0;
        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                if (ints[j] > max) {
                    max = ints[j];
                }
            }
        }
        return max;
    }
    public static void displayTwoDimensionalArray(int[][] array){
        for (int i=0;i<array.length;i++){
            for (int j=0; j< array[0].length;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
