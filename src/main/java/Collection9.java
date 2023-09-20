import java.util.LinkedList;
import java.util.ListIterator;

public class Collection9 {
    public static void main(String[] args) {
        /*
        Bir LinkedList oluşturalım ve Iterator yöntemi ile tersten yazdıralım.

LinkedList elemanları: sari,mavi,yesil,kirmizi,beyaz,mor
Beklenen Çıktı:
Orijinal linked list: [sari,mavi,yesil,kirmizi,beyaz,mor]
LinkedList Tersi:
mor
beyaz
kirmizi
yesil
mavi
sari
         */

        LinkedList<String> list = new LinkedList<>();
        list.add("Sari");
        list.add("Mavi");
        list.add("Yeşil");
        list.add("Kirmizi");
        list.add("Beyaz");
        list.add("Mor");

        ListIterator<String> newList = list.listIterator();

        while (newList.hasNext()){
            newList.next();
        }

        while (newList.hasPrevious()){
           String reversed= newList.previous();
            System.out.println(reversed);
        }



    }
}
