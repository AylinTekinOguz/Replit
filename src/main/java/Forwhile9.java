import java.util.Scanner;

public class Forwhile9 {
    public static void main(String[] args) {
        /*
        Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)


Input  :1238

Output :Girilen Numananin Tersi: 8321
         */

        Scanner input = new Scanner(System.in);

        String sayi = input.next();
        String ters = "";

        for (int i = sayi.length()-1; i >=0 ; i--) {
            ters=ters+sayi.charAt(i);
        }

        System.out.println("Girilen Numananin Tersi: " + ters);




    }
}
