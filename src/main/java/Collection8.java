import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Collection8 {
    public static void main(String[] args) {
        /*
        Bir LinkedList oluşturalım ve ilk ve son elemanlarını iterator özelliğini kullanarak yazdıralım
LinkedList: sari,mavi,turuncu,siyah,yesil,beyaz
Beklenen Çıktı:
Orjinal list elemanlari: [sari,mavi,turuncu,siyah,yesil,beyaz]
Listenin ilk elemani: sari
listenin son elemani: beyaz
         */

        LinkedList<String> list = new LinkedList<>();
        list.add("Sari");
        list.add("Mavi");
        list.add("Turuncu");
        list.add("Siyah");
        list.add("Yeşil");
        list.add("Beyaz");

        ListIterator<String> newList = list.listIterator();

        String ilk = newList.next();
        System.out.println("Listenin ilk elemanı: "+ ilk);

       while (newList.hasNext()){
           newList.next();
       }

            String son = newList.previous();
            System.out.println("Listenin son elemanı: "+ son);








    }
}
