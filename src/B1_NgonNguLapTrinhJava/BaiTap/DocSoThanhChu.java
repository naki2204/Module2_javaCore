package B1_NgonNguLapTrinhJava.BaiTap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a =scanner.nextInt();
        String read;
        if(a<=9){
            read=OneToNine(a);
            System.out.println(read);
        }if(9<a && 20>a){
            TenToNineteen(a);
        }if(20<a && 100>a){
            read=TwentyToNinetynine(a);
            System.out.println(read);
        }if(100<=a && 1000>a){
            read=OneHundredToNineHundredNinetyNine(a);
            System.out.println(read);
        }

    }
    private static String OneToNine(int a){
        String one_digit="";
        switch (a){
            case 0:
                one_digit="zero";
                break;
            case 1:
                one_digit="one";
                break;
            case 2:
                one_digit="two";
                break;
            case 3:
                one_digit="three";
                break;
            case 4:
                one_digit="four";
                break;
            case 5:
                one_digit="five";
                break;
            case 6:
                one_digit="six";
                break;
            case 7:
                one_digit="seven";
                break;
            case 8:
                one_digit="eight";
                break;
            case 9:
                one_digit="nine";
                break;
        }
        return one_digit;

    }
    private static String TenToNineteen(int a){
        String ReadTenToNineteen="";
        switch (a){
            case 10:
                ReadTenToNineteen="ten";
                break;
            case 11:
                ReadTenToNineteen="eleven";
                break;
            case 12:
                ReadTenToNineteen="twelve";
                break;
            case 13:
                ReadTenToNineteen="thirteen";
                break;
            case 14:
                ReadTenToNineteen="fourteen";
                break;
            case 15:
                ReadTenToNineteen="fifteen";
                break;
            case 16:
                ReadTenToNineteen="sixteen";
                break;
            case 17:
                ReadTenToNineteen="seventeen";
                break;
            case 18:
                ReadTenToNineteen="eighteen";
                break;
            case 19:
                ReadTenToNineteen="nineteen";
                break;
        }
        return ReadTenToNineteen;

    }
    private static String TwentyToNinetynine(int a){
        int b=a%10;
        int c=a-b;
        String ReadTwentyToninetynine="";
        String dozens="";
        String row_unit="";
        switch (c){
            case 20:
                dozens="twenty";
                break;
            case 30:
                dozens="thirty";
                break;
            case 40:
                dozens="forty";
                break;
            case 50:
                dozens="fifty";
                break;
            case 60:
                dozens="sixty";
                break;
            case 70:
                dozens="seventy";
                break;
            case 80:
                dozens="eighty";
                break;
            case 90:
                dozens="ninety";
                break;
        }
        row_unit=OneToNine(b);
        if(b==0){
            ReadTwentyToninetynine=dozens;
        }else {
            ReadTwentyToninetynine=dozens+" "+row_unit;
        }
        return ReadTwentyToninetynine;

    }

    private static String OneHundredToNineHundredNinetyNine(int a){
        String ReadOneHundredToNineHundredNinetyNine="";
        String hundred="";
        String dozens="";
        int b=a%100;
        int c=a-b;
        switch (c){
            case 100:
                hundred="one hundred";
                break;
            case 200:
                hundred="two hundred";
                break;
            case 300:
                hundred="three hundred";
                break;
            case 400:
                hundred="four hundred";
                break;
            case 500:
                hundred="five hundred";
                break;
            case 600:
                hundred="six hundred";
                break;
            case 700:
                hundred="seven hundred";
                break;
            case 800:
                hundred="eight hundred";
                break;
            case 900:
                hundred="nine hundred";
                break;
        }
        dozens=TwentyToNinetynine(b);
        ReadOneHundredToNineHundredNinetyNine=hundred+" "+dozens;
        return ReadOneHundredToNineHundredNinetyNine;
    }

}
