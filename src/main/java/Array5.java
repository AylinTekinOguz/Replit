import java.sql.Array;
import java.util.Arrays;

public class Array5 {
    public static void main(String[] args) {
        /*
        yazılan değerin array içerisinde arayan Java Kodu yazınız.
Array: [1551,1223,1443,1267,1789,1023,2020]
Aranan Değer:2020
Beklenen Çıktı:**True*
Aranan Değer:2010
Beklenen Çıktı :**False**
         */

        int arr []={1551,1223,1443,1267,1789,1023,2020};
        int arananDeger =2010;
        int isExist = Arrays.binarySearch(arr,arananDeger);


            Arrays.sort(arr);

            if (isExist>=0){
                System.out.println("True");
            }else {
                System.out.println("False");
            }


    }
}
