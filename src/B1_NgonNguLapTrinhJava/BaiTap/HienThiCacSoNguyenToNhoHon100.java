package B1_NgonNguLapTrinhJava.BaiTap;

public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        for (int number=2;number<100;number++){
            if (IsThePrime(number)){
                System.out.println(number);
            }
        }
    }
    public static boolean IsThePrime(int a){
        boolean is_the_prime=false;
        if(a<=2){
            if(a<2){
                is_the_prime=false;
            }
            if(a==2){
                is_the_prime=true;
            }
        }else {
            for (int i=2;i<a;i++){
                if(a%i==0){
                    is_the_prime=false;
                    break;
                }else {
                    is_the_prime=true;
                }
            }

        }

        return is_the_prime;
    }
}
