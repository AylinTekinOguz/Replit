import java.util.Iterator;
import java.util.TreeSet;

public class Collection13 {
    public static void main(String[] args) {
        /*Bir TreeSet oluşturalım ve tüm elemanlatını tektek yazdıralım.
            TreeSet elemanları: yesil,mavi,kirmizi,sari,beyaz,siyah
            Beklenen Çıktı:
            beyaz
            kirmizi
            mavi
            sari
            siyah
            yesil*/

        TreeSet<String> renk = new TreeSet<>();
        renk.add("yesil");
        renk.add("mavi");
        renk.add("kirmizi");
        renk.add("sari");
        renk.add("beyaz");
        renk.add("siyah");

        Iterator<String> itr = renk.iterator();

        while (itr.hasNext()){
           String renk2 = itr.next();
            System.out.println(renk2);
        }

    }
}
