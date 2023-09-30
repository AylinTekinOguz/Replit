import java.util.TreeSet;

public class Collection16 {
    public static void main(String[] args) {
      /*  Bir TreeSet oluşturalım ve Tree Listesini ve listedeki eleman sayısını yazdıran java kodunu yazdıralım.

        TreeSet elemanları: yesil,sari,mavi,kirmizi,pembe
        Beklenen Çıktı:
        Orjinal TreeSet: [kirmizi,mavi,pembe,sari,yesil]
        Tree eleman sayısı: 5*/

        TreeSet<String> renk = new TreeSet<>();
        renk.add("yesil");
        renk.add("sari");
        renk.add("mavi");
        renk.add("kirmizi");
        renk.add("pembe");

        System.out.println(renk);

        System.out.println("Tree eleman sayisi: "+renk.size());






    }
}
