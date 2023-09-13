import java.util.Scanner;

public class Scanner8 {
    public static void main(String[] args) {
        /*Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.

   Örnek Çıktı:


   Verilen tamsayının rakamları toplamı 10'dur.*/

        Scanner input = new Scanner(System.in);

        int sayi = input.nextInt();

        int a = sayi%10;
        int b = (sayi/10)%10;
        int c= sayi/100;

        System.out.println("Verilen tamsayinin rakamlari toplami " + (a+b+c)+ "'dur.");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
