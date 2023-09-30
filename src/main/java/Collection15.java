import java.util.TreeSet;

public class Collection15 {
    public static void main(String[] args) {
        /*
        Bir TreeSet oluşturalım ve ilk ve son elemanlarını yazdıralım.

TreeSet elemanları: sari,mavi,yesil,kirmizi,turuncu,pembe
Beklenen Çıktı:
Orjinal Tree: [kirmizi,mavi,pembe,sari,turuncu,yesil]
ilk elemen: kirmizi
son eleman: yesil
         */

        TreeSet<String> renk = new TreeSet<>();

        renk.add("sari");
        renk.add("mavi");
        renk.add("yesil");
        renk.add("kirmizi");
        renk.add("turuncu");
        renk.add("pembe");

        System.out.println("ilk eleman: " +renk.first());
        System.out.println("son eleman: "+ renk.last());





    }
}
