package B1_NgonNguLapTrinhJava.BaiTap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Menu();
    }

    private static void Menu(){
        int choise=-1;
        Scanner scanner= new Scanner(System.in);
        while (choise!=0){
            System.out.println("Menu" +
                    "\n1.Print the rectangle" +
                    "\n2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)" +
                    "\n3.Print isosceles triangle" +
                    "\n4.Exit");
            choise=scanner.nextInt();
            switch (choise){
                case 1:
                    PrinTheRectangle();
                    break;
                case 2:
                    PrintTheSquareTriangle();
                    break;
                case 3:
                    PrintIsoscelesTriangle();
                    break;
                case 4:
                    System.exit(4);
                    break;
                default:
                    System.out.println("choose again !!!");
            }
        }
    }
    private static void PrinTheRectangle(){
        int height, width;
        String PrinTheRectangle;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the height of the rectangle: ");
        height= input.nextInt();
        System.out.println("Enter the width of the rectangle: ");
        width=input.nextInt();
        for(int i=1;i<=height;i++){
            for (int j=0;j<=width;j++){
                System.out.print("*  ");
            }
            System.out.println();

        }
        input.nextLine();
        input.nextLine();
    }

    private static void PrintTheSquareTriangle(){
        Scanner scanner=new Scanner(System.in);
        int choise=-1;
        while (choise!=5){
            System.out.println("Print the square triangle" +
                    "\nThe corner is square at 4 different angles:" +
                    "\n1.top-left" +
                    "\n2.top-right" +
                    "\n3.botton-left" +
                    "\n4.botton-right" +
                    "\n5.Bach to menu");
            choise=scanner.nextInt();
            switch (choise){
                case 1:
                    PrintTheSquareTriangleTopLeft();
                    break;
                case 2:
                    PrintTheSquareTriangleTopRight();
                    break;
                case 3:
                    PrintTheSquareTriangleBottonLeft();
                    break;
                case 4:
                    PrintTheSquareTriangleBottonRight();
                    break;
                case 5:
                    Menu();
                default:
                    System.out.println("choose again !!!");
            }
        }
    }


    private static void PrintTheSquareTriangleTopLeft(){
        Scanner input=new Scanner(System.in);
        int height,width;
        System.out.println("Enter height of square triangle");
        height=input.nextInt();
        int run=height;
        for (int i=0;i<height;i++){
            for (int j=0;j<run;j++){
                System.out.print("*  ");
            }
            run--;
            System.out.println();
        }
        input.nextLine();
        input.nextLine();
    }


    private static void PrintTheSquareTriangleBottonLeft(){
        Scanner input=new Scanner(System.in);
        int height,width;
        System.out.println("Enter height of square triangle");
        height=input.nextInt();
        int run =1;
        for (int i=0;i<height;i++){
            for (int j=0;j<run;j++){
                System.out.print("*  ");
            }
            run++;
            System.out.println();
        }
        input.nextLine();
        input.nextLine();
    }


    private static void PrintTheSquareTriangleTopRight(){
        Scanner input=new Scanner(System.in);
        int height,width;
        System.out.println("Enter height of square triangle");
        height=input.nextInt();
        int run=height;
        int space=0;
        for (int i=0;i<height;i++){
            for (int a=0;a<space;a++){
                System.out.print("   ");
            }
            for (int j=0;j<run;j++){
                System.out.print("*  ");
            }
            run--;
            space++;
            System.out.println();
        }
        input.nextLine();
        input.nextLine();
    }


    private static void PrintTheSquareTriangleBottonRight() {
        Scanner input = new Scanner(System.in);
        int height, width;
        System.out.println("Enter height of square triangle");
        height = input.nextInt();
        int run = 1;
        int space = height-run;
        for (int i = 0; i < height; i++) {
            for (int a = 0; a < space; a++) {
                System.out.print("   ");
            }
            for (int j = 0; j < run; j++) {
                System.out.print("*  ");
            }

            run++;
            space--;
            System.out.println();
        }
        input.nextLine();
        input.nextLine();
    }

    private static void PrintIsoscelesTriangle(){
        Scanner input = new Scanner(System.in);
        int height, width;
        System.out.println("Enter height of square triangle");
        height = input.nextInt();
        width=height*2;
        int run = 1;
        int space = height-1;
        for (int i = 0; i < height; i++) {
            for (int a = 0; a < space; a++) {
                System.out.print("   ");
            }
            for (int j = 0; j < run; j++) {
                System.out.print("*  ");
            }

            run=run+2;
            space--;
            System.out.println();
        }
        input.nextLine();
        input.nextLine();
    }

}
