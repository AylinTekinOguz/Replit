import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Collection11 {
    public static void main(String[] args) {
        /*HashSet ile list oluşturalım ve  TreeSet ile sıralayalım ve listeyi yazdıralım.

                HashSet List: sari,mavi,kirmizi,yesil,mor
        Beklenen Çıktı:
        TreeSet elements:
        kirmizi
        mavi
        mor
        sari
        yesil*/

        HashSet<String> renk = new HashSet<>();
        renk.add("sari");
        renk.add("mavi");
        renk.add("kirmizi");
        renk.add("yesil");
        renk.add("mor");

        TreeSet<String> renk2 = new TreeSet<>(renk);

        Iterator<String> iterator = renk2.iterator();

        while (iterator.hasNext()){
            String treeset =iterator.next();
            System.out.println(treeset);
        }



    }
}
