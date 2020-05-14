package B2_MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int temp;
        Scanner scanner =new Scanner(System.in);
        int[] array ={4, 2, 6, 8, 5, 0, 0};
        int index=array.length+1;
        System.out.println("Property list: ");
        for (int number:array) {
            System.out.print(number+"\t");
        }
        System.out.println();

        while (index>array.length){
            System.out.println("choose index add:");
            index=scanner.nextInt();
            if (index>array.length){
                System.out.println("input index fail!!");
            }
        }
        System.out.println("value add:");
        temp=scanner.nextInt();

        for (int i=array.length-1;i>(index-1);i--){
            if(i==index){
                array[i]=array[i-1];
                array[i-1]=temp;
            }else {
                array[i]=array[i-1];
            }
        }
        System.out.println();
        System.out.println("Property list after adding element: ");
        for (int number:array) {
            System.out.print(number+"\t");
        }

    }
}
