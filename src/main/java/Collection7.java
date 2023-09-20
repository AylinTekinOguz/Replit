import java.awt.event.ItemEvent;
import java.util.Iterator;
import java.util.LinkedList;

public class Collection7 {
    public static void main(String[] args) {
       /* bir LinkedList oluşturalım ve Iterator methodunu kullanarak listedeki elemanlardan istenilen pozisyondan başlayarak listeyi yazdıralım.
        LinkedList elemanlari: sari,beyaz,mavi,yesil,turuncu
        1. elemandan itibaren yazdıralım.

        Beklenen Çıktı:
        beyaz
        mavi
        yesil
        turuncu*/

        LinkedList<String> list = new LinkedList<>();
        list.add("Sari");
        list.add("Beyaz");
        list.add("Mavi");
        list.add("Yeşil");
        list.add("Turuncu");


        Iterator <String> newList = list.iterator();

           newList.next();
            newList.remove();


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }












    }
}
