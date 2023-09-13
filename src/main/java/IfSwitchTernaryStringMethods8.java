import java.util.Scanner;

public class IfSwitchTernaryStringMethods8 {
    public static void main(String[] args) {
        /*Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın

        Kullanicidan alinan isim uzunluğu en az 2 olacaktır.

                INPUT   : Mustafa

        OUTPUT  : fafafa
                 */

        Scanner input = new Scanner(System.in);
        String isim = input.next();

      isim = isim.substring(isim.length()-2);

        System.out.println(isim.repeat(3));
    }
}
