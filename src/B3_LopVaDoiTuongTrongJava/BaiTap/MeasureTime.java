package B3_LopVaDoiTuongTrongJava.BaiTap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class MeasureTime {
    public static void main(String[] args) {
        Random rd=new Random();
        int[] array=new int[100000];
        for (int i=0;i<array.length;i++){
            array[i]=rd.nextInt(100000);
        }
        StopWatch time = new StopWatch();
        time.start();
        Arrays.sort(array);
        time.stop();
        System.out.println("measured time"+time.getElapsedTime());

    }
}
