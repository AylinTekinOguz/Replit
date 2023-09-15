import java.sql.Array;
import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        /*
        Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.

not: Test datadaki değerleri kullanınız.
Test Data:
[1232, 1134,2345,1022]

Beklenen Çıktı:
[1022,1134,1232,2345]

         */

        int arr [] = new int[4];

        arr[0] = 1232;
        arr[1] = 1134;
        arr[2] = 2345;
        arr[3] = 1022;

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));





    }
}
