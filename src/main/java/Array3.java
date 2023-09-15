public class Array3 {
    public static void main(String[] args) {
        /*
        Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.

Array =  [20, 30, 25, 35, -16, 60, -100 ]
Beklenen Çıktı:
Array Sayılarının ortalaması: 7.0
         */

        int arr [] = {20, 30, 25, 35, -16, 60, -100};

        int sum=0;

        for (int w:arr) {
            sum=sum+w;
        }

        System.out.println("Array Sayılarının ortalaması: " + (sum/arr.length)+".0");
    }
}
