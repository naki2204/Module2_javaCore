package B2_MangVaPhuongThucTrongJava.ThucHanh;

import java.util.Scanner;

public class ChuongTrinhChuyenDoiNhietDo {
    public static void main(String[] args) {
        DisplayMenu();

    }
    private static void DisplayMenu(){
        double fahrenheit = 0;
        double celsius=0;
        System.out.println("" +
                "\n1.Fahrenheit to Celsius" +
                "\n2.Celsius to Fahrenheit" +
                "\n3.Exit");
        Scanner scanner = new Scanner(System.in);
        int choise = scanner.nextInt();
        switch (choise){
            case 1:
                System.out.println("Enter the fahrenheit: ");
                fahrenheit=scanner.nextDouble();
                celsius=fahrenheitToCelsius(fahrenheit);
                System.out.println(fahrenheit+" độ F "+"="+celsius+" độ C");
                break;
            case 2:
                System.out.println("Enter the fahrenheit: ");
                celsius=scanner.nextDouble();
                fahrenheit=celsiusToFahrenheit(celsius);
                System.out.println(celsius+" độ C "+"="+fahrenheit+" độ F");
                break;
            case 3:
                System.exit(3);
                break;
            default:
                System.out.println("input choose fail!!");
                DisplayMenu();
        }
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

}
