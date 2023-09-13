import java.util.Scanner;

public class Scanner9 {
    public static void main(String[] args) {
        /*Girilen zamanı saniyeye çeviren bir program yazınız.


Örnek Çıktı:

1 saat 10 dakika 50 saniye ==>

4250 saniye*/

        Scanner input = new Scanner(System.in);

        int saat = input.nextInt();
        int dakika = input.nextInt();
        int saniye = input.nextInt();

        System.out.println((saat*60*60)+(dakika*60)+ saniye);
    }
}
