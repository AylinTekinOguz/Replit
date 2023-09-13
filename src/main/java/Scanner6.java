import java.util.Scanner;

public class Scanner6 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir Float değer girmesini isteyin, bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.
         */

        Scanner input = new Scanner(System.in);

        float sayi = input.nextFloat();

        short shortSayi = (short) sayi;

        System.out.println(shortSayi);
    }
}
