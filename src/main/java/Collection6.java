import java.util.LinkedList;

public class Collection6 {
    public static void main(String[] args) {
        /*
        Bir likedList oluşturalım ve tüm elemanlarını tek tek yazdıralım.

LinkedList elemanları: sari,mavi,mor,yesil,beyaz
Beklenen Çıktı:
sari
mavi
mor
yesil
beyaz
         */

        LinkedList<String> list = new LinkedList<>();

        list.add("sari");






        list.add("mavi");
        list.add("mor");
        list.add("yesil");
        list.add("beyaz");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
