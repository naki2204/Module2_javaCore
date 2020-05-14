package B3_LopVaDoiTuongTrongJava.ThucHanh;

import java.util.Scanner;

public class Rectangle {
    double width,height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return (this.width+this.height)*2;
    }
    public String display(){
        return "Rectangle have :" +
                "\nwidth: " + this.width+
                "\nheight: " + this.height+
                "\narea: "+ this.getArea()+
                "\nperimeter: "+ this.getPerimeter();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        Rectangle rectangle=new Rectangle(width,height);
        System.out.println(rectangle.display());
    }
}
