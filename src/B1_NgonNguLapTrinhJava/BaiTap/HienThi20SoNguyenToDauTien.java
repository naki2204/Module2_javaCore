package B1_NgonNguLapTrinhJava.BaiTap;

import static B1_NgonNguLapTrinhJava.BaiTap.HienThiCacSoNguyenToNhoHon100.IsThePrime;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        int count=0;
        int number=2;
        while (count!=20){
            if(IsThePrime(number)){
                count++;
                System.out.println(count+"."+number);
            }
            number++;
        }
    }
}
