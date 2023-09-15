import java.util.ArrayList;

public class Collection4 {
    public static void main(String[] args) {
        /*
        Bir ArrayList oluşturalım ve istenen sıradaki elemanı güncelleyelim.

Array Elemanları: sari,yesil,mavi,pembe
**mavi rengini turuncu ile değiştirelim.**
Beklene Çıktı:
[sari,yesil,mavi,pembe]
[sari,yesil,turuncu,pembe]
         */

        ArrayList<String> arr = new ArrayList<>();

        arr.add("sari");
        arr.add("yesil");
        arr.add("mavi");
        arr.add("pembe");

        arr.set(2,"turuncu");

        System.out.println(arr);

    }
}
