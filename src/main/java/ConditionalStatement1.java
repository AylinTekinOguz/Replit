import java.util.Scanner;

public class ConditionalStatement1 {
    public static void main(String[] args) {
       /* Girilen sayının pozitif,  negatif veya sıfır olup olmadığını yazdırın Java Kodunu yazınız.
        Test data :21
        Beklenen Çıktı:
        Sayı Pozitif
        Test data :-15
        Beklenen Çıktı:
        Sayı Negatif
        Test data :0
        Beklenen Çıktı:
        Sayı Sıfır*/

        Scanner in = new Scanner(System.in);

        int input = in.nextInt();

        if (input<0){
            System.out.println("Sayi negatif");
        } else if (input>0) {
            System.out.println("Sayi pozitif");
        }else {
            System.out.println("Sayi Sıfır");
        }


    }
}
