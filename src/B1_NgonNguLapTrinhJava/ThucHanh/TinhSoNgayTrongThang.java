package B1_NgonNguLapTrinhJava.ThucHanh;

import java.util.Scanner;

import static B1_NgonNguLapTrinhJava.ThucHanh.KiemTraNamNhuan.IsLeapYear;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Which month that you want to count days? ");
        int month = scanner.nextInt();
        switch (month){
            case 2:
                System.out.println("Enter the year");
                int year=scanner.nextInt();
                if(IsLeapYear(year)){
                    System.out.println("The month '"+month+"' has 29 days!");
                }else {
                    System.out.println("The month '"+month+"' has 28 days!");
                }

                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The month '"+month+"' has 31 days!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("The month '"+month+"' has 30 days!");
                break;
            default:
                System.out.println("Invalid input!");
        }

    }

}
