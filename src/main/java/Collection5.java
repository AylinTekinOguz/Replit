import java.util.ArrayList;

public class Collection5 {
    public static void main(String[] args) {
        /*
        Bir ArrayList oluşturum ve önce ArrayListi yazdıralım sonra index numarasına göre tek tek yazdıralım.

ArrayList: siyah,mavi, kirmizi,yesil,mor,turuncu
Beklenen Çıktı:
Orjinal array list: [siyah,mavi,kirmizi,yesil,mor,turuncu]
siyah
mavi
kirmizi
yesil
mor
turuncu
         */

        ArrayList<String> arr = new ArrayList<>();

        arr.add("siyah");
        arr.add("mavi");
        arr.add("kirmizi");
        arr.add("yesil");
        arr.add("mor");
        arr.add("turuncu");

        System.out.println(arr);

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

    }
}
