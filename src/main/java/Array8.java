import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array8 {
    public static void main(String[] args) {
        /*
        Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.

Array: [1232,2345,5467,678,3454,2312,3451]
         */

        ArrayList <Integer> arr= new ArrayList<>();
        arr.add(1232);
        arr.add(2345);
        arr.add(5467);
        arr.add(678);
        arr.add(3454);
        arr.add(2312);
        arr.add(3451);

        Collections.sort(arr);
        System.out.println(arr);

        System.out.println(arr.get(arr.size()-2));

    }
}
