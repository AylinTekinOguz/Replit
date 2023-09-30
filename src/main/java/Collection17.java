import java.util.TreeSet;

public class Collection17 {
    public static void main(String[] args) {
        /*
        Ortak elemanları olan 2 farklı TreeSet oluşturalım ve elemanlarını tektek karşılaştırıp aynı olanlar için "yes"  farklı olanlar için "no" yazdıralım.

1. TreeSet: mavi,yesil,kirmizi,sari
2. TreeSet: yesil,mavi,pembe,turuncu
Beklenen Çıktı:
1. TreeSet: [kirmizi,mavi,sari,yesil]
2. TreeSet: [mavi,pembe,turuncu,yesil
Karsilastirma Sonucu:
no
yes
no
yes
         */

        TreeSet<String> set1 = new TreeSet<>();
        set1.add("mavi");
        set1.add("yesil");
        set1.add("kirmizi");
        set1.add("sari");

        TreeSet<String> set2 = new TreeSet<>();
        set2.add("yesil");
        set2.add("mavi");
        set2.add("pembe");
        set2.add("turuncu");


        for (String w:set1) {
            if (set2.contains(w)){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }




    }
}
