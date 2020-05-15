package B2_MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int[] array1;
        int[] array2;
        System.out.println("Create");

    }
    public int[] creatArray(){
        Scanner scanner= new Scanner(System.in);
        int side=-1;
        while (!(side>0 && side<20)){
            System.out.print("Enter the side of array: ");
            side=scanner.nextInt();
            if(!(side>0 && side<20)){
                System.out.println("the side fail!!!.Please enter the side");
            }
        }
        int[] array=new int[side];
        for (int element:array) {
            element=scanner.nextInt();
        }
        return array;
    }
}
