package B1_NgonNguLapTrinhJava.ThucHanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year you want to know");
        int the_year=scanner.nextInt();
        if(IsLeapYear(the_year)){
            System.out.println(the_year+" là năm nhuận");
        }else {
            System.out.println(the_year+" không phải năm nhuận");
        }

    }
    public static boolean IsLeapYear(int year){
        boolean isLeapYear = false;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                 isLeapYear=true;
                }
            }else {
                isLeapYear=true;
            }
        }
        return isLeapYear;
    }
}
