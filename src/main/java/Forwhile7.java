import java.util.Scanner;

public class Forwhile7 {
    public static void main(String[] args) {
        /*
        Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.

* Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi bir sayı Mükemmel Sayı olarak bilinir.


Input :

6

Output:

6 Mukemmel Sayidir.

======================

Input

7

Output:

7 Mukemmel Sayidir degildir.
         */

        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        int toplam =0;

        for (int i = 1; i < sayi; i++) {
            if (sayi%i==0){
                toplam=toplam+i;
            }else {
                continue;
            }
        }

        if (sayi==toplam){
            System.out.println(sayi+" Mukemmel Sayidir");
        }else {
            System.out.println(sayi+" Mukemmel Sayidir degildir");
        }






    }

}
