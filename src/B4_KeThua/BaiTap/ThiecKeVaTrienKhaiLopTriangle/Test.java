package B4_KeThua.BaiTap.ThiecKeVaTrienKhaiLopTriangle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        double side1;
        double side2;
        double side3;
        String color;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Enter the lenght of the triangle: " +
                    "\nSide1: ");
            side1=scanner.nextDouble();
            System.out.println("Side2: ");
            side2=scanner.nextDouble();
            System.out.println("Side3: ");
            side3=scanner.nextDouble();
//            System.out.println("Enter color of the triangle: ");
//            color=scanner.next();
            if(!testSide(side1,side2,side3)){
                System.out.println("The sides are not the 3 sides lenght of the triangle");
                System.out.println("Please enter again:");
            }
        }while (!testSide(side1,side2,side3));
        Triangle triangle =new Triangle("red",side1,side2,side3);
        System.out.println(triangle);

    }

    public static boolean testSide(double side1,double side2,double side3){
        return Math.abs(side1 - side2) < side3 && side3 < (side1 + side2);
    }
}
