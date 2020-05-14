package B2_MangVaPhuongThucTrongJava.ThucHanh;

import java.util.Scanner;

public class DaoNguocCacPhanTuCuaMang {
    public static void main(String[] args) {
        int side;
        int[] array;
        Scanner scanner =new Scanner(System.in);
        do {
            System.out.print("Enter the side: ");
            side= scanner.nextInt();
            if(side>20){
                System.out.println("Size should not exceed 20");
            }
        }while (side>20);
        array = new int[side];
        for (int i=0;i<array.length;i++){
            System.out.print("Enter the element "+(i+1)+" : ");
            array[i]=scanner.nextInt();
        }
        System.out.println("Property list");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();

        int temp;
        for (int i=0;i<(array.length/2);i++){
            temp=array[i];
            array[i]=array[array.length-i-1];
            array[array.length-1-i]=temp;
        }

        System.out.println("Property list after Reverse:");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }

    }
}
