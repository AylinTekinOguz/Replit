import java.util.ArrayList;

public class Collection3 {
    public static void main(String[] args) {
        /*
        Bir ArrayList oluşturalım ve birinci ve üçüncü elemanlarını yazdıralım.
ArrayList elemanları:  beyaz,siyah,sari,kirmizi,turuncu`
Beklenen Çıktı:
Arrayin 1. elemani: beyaz
Arrayin 3. elemani: sari
         */

        ArrayList<String> arr = new ArrayList<>();

        arr.add("beyaz");
        arr.add("siyah");
        arr.add("sari");
        arr.add("kirmizi");
        arr.add("turuncu");

        System.out.println("Arrayin 1. elemani: "+arr.get(0));
        System.out.println("Arrayin 3. elemani: "+arr.get(2));



    }
}
