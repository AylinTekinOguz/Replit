import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Collection10 {
    public static void main(String[] args) {
        /*
        Bir LinkedList oluşturalım ve ilk eleman ile 4. elemanı yerdeğiştiren java kodunu yazınız.

LinkedList: mavi,kirmizi,beyaz,siyah,yesil,turuncu
**hint:  Collections.swap();**
Beklene Çıktı:
Orjinal LinkedList: [mavi,kirmizi,beyaz,siyah,yesil,turuncu]
Swap sonrası durum: [**siyah**,kirmizi,beyaz,**mavi**,yesil,turuncu]
         */

        LinkedList <String> list = new LinkedList<>();
        list.add("Mavi");
        list.add("Kirmizi");
        list.add("Beyaz");
        list.add("Siyah");
        list.add("Yeşil");
        list.add("Turuncu");

        Collections.swap(list,0,3);

        System.out.println(list);







    }
}
