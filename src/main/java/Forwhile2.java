import java.util.Scanner;

public class Forwhile2 {
    public static void main(String[] args) {

        /*
        Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.

Input :

30

40

	Beklenen Cikti:

30 ve 40 icin GCD = 10

30 ve 40 icin LCM = 120
         */

        Scanner input = new Scanner(System.in);

        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();

        int GCD =1;
        int bolen =2;

        while (bolen<=sayi1 && bolen<=sayi2){
            if (sayi1%bolen==0 && sayi2%bolen==0)
                GCD=bolen;
                bolen++;

        }

        System.out.println("GCD = " + GCD);

        int lcm = (sayi1*sayi2)/GCD;

        System.out.println("LCM = " + lcm);




    }



}
