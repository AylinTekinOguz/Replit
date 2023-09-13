import java.util.Scanner;

public class IfSwitchTernaryStringMethods3 {
    public static void main(String[] args) {
       /* Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın.
        Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.

        Ornek:

        INPUT      :

        25

        46

        OUTPUT :

        Numaralarin Toplami:

        71
        */

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen birinci sayı giriniz");
        int sayi1 = input.nextInt();

        System.out.println("Lütfen ikinci sayı giriniz");
        int sayi2 = input.nextInt();

        int toplam = sayi1 + sayi2;

        if (sayi1 < 0 || sayi2 < 0) {
            System.out.println("Lütfen 0 veya daha büyük bir sayı giriniz");
        } else if (toplam > 999999999 || sayi1 > 999999999 || sayi2 > 999999999) {
            System.out.println("OverFlow");
        } else {
            System.out.println("Sayıların toplamı : " +toplam);


        }
    }

}