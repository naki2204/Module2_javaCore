package B3_LopVaDoiTuongTrongJava.BaiTap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(){
        return (this.getB()* this.getB())-4* this.getA()* this.getC();
    }
    public double getRoot1(){
        return (-this.getB()+Math.pow(this.getDiscriminant(),0.5))/(2*this.getA());
    }
    public double getRoot2(){
        return (-this.getB()-Math.pow(this.getDiscriminant(),0.5))/(2*this.getA());
    }
    public String display(){
        String root;
        if(this.getDiscriminant()<0){
            root="The equation has no roots !!";
        }else {
            if(this.getDiscriminant()==0){
                root="The equation has one root: "+this.getRoot1();
            }else {
                root="The equation has two roots:" +
                        "\nRoot1: "+this.getRoot1()+
                        "\nRoot2: "+this.getRoot2();
            }
        }
        return root;
    }

    @Override
    public String toString() {
        return "QuadraticEquation{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}'+
                "\n"+this.display();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c;
        System.out.print("Enter a of equation: ");
        a=scanner.nextDouble();
        System.out.print("Enter b of equation: ");
        b=scanner.nextDouble();
        System.out.print("Enter c of equation: ");
        c=scanner.nextDouble();
        QuadraticEquation equation =new QuadraticEquation(a,b,c);
        System.out.println(equation.toString());
    }
}
