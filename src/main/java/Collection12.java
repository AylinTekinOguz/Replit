import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Collection12 {
    public static void main(String[] args) {
      /*  Bir HashSet oluşturalım ve HashSet elemanlarını TreeSet e dönüştürelim. Tree Set elemanlarını tektek yazdıralım.
                HashSet elemanları: sari,mavi,yesil,turuncu,kirmizi
        Beklenen Çıktı:
        Tree Set Elemanlari:
        kirmizi
        mavi
        sari
        turuncu
        yesil*/

        HashSet<String> renk = new HashSet<>();
        renk.add("sari");
        renk.add("mavi");
        renk.add("yesil");
        renk.add("turuncu");
        renk.add("kirmizi");

        TreeSet<String> renk2 = new TreeSet<>(renk);

        Iterator<String> iterator = renk2.iterator();

        while (iterator.hasNext()){
            String treeset =iterator.next();
            System.out.println(treeset);
        }
    }
}
