import java.util.Scanner;

public class Scanner4 {
    public static void main(String[] args) {
        /*
        Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun. Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.


1 şeker = 1.7 gr


Örnek Çıktı:
çay=10
şeker=2
Yılda 12.41 kg şeker kullanıyor.
         */

        Scanner input = new Scanner(System.in);

        int cay=input.nextInt();
        double seker = input.nextInt();

        System.out.println("Yilda " + ((cay*seker*1.7*365)/1000) + " kg seker kullaniyor." );





    }
}
