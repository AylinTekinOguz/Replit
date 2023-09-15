import java.util.ArrayList;

public class Collection1 {
    public static void main(String[] args) {
        /*
        Bir ArrayList oluşturun ve array elemanlarını tek tek yazdırın.

Array elemanları:  siyah,sari,mavi,turuncu
Beklenen Çıktı:
siyah
sari
mavi
turuncu
         */

        ArrayList<String> arr = new ArrayList<>();
        arr.add("siyah");
        arr.add("sari");
        arr.add("mavi");
        arr.add("turuncu");

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }






    }
}
