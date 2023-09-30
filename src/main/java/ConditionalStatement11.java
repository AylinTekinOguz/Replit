import java.util.Scanner;

public class ConditionalStatement11 {
    public static void main(String[] args) {
        /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu, değilse sessiz harf olduğunu ekrana yazdırsın.
        Girdiği değer harf değilse yada 1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

Sesli harfler: a,e,i,o,u
Test Data:
a
Beklenen Çıktı:
a harfi sesli harfdir.
Test Data:
d
Beklenen Çıktı:
d harfi sesiz harftir.
Test Data:
we  yada %
Beklenen Çıktı:
Yanlis karakter girdiniz!*/

        Scanner input = new Scanner(System.in);
        String harf = input.next();

        if (harf.length()>1|| harf.replaceAll("[a-zA-Z]","").length()>0){
            System.out.println("Yanlis karakter girdiniz!");
        }else if (harf.replaceAll("[aeiouAEIOU]","").isEmpty()){
            System.out.println(harf+" sesli harftir.");
        }else {
            System.out.println(harf+" sessiz harftir.");
        }






    }
}
