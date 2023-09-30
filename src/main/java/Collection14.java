import java.util.Iterator;
import java.util.TreeSet;

public class Collection14 {
    public static void main(String[] args) {
        /*
        Bir TreeSet yapalım ve elemanlarını önce normal yazdıralım ve ardından  descendingIterator()  fonksiyonunu kullanarak ters sıradan yazdıralım.

TreeSet elemanları:  yesil,sari,mavi,turuncu,kirmizi
Beklenen Çıktı:
Orjinal Tree sonucu: [kirmizi,mavi,sari,turuncu,yesil]
Tersten Siralanisi:
yesil
turuncu
sari
mavi
kirmizi
         */

        TreeSet<String> renk = new TreeSet<>();
        renk.add("yesil");
        renk.add("sari");
        renk.add("mavi");
        renk.add("turuncu");
        renk.add("kirmizi");

        System.out.println(renk);

        Iterator<String> ters = renk.descendingIterator();

        while (ters.hasNext()){
            String tersEleman = ters.next();
            System.out.println(tersEleman);
        }






    }
}
