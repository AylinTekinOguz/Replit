import java.util.Scanner;

public class IfSwitchTernaryStringMethods5 {
    public static void main(String[] args) {
        /*Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.

                INPUT:

        Ay Numarasi:

        2

        Yil :

        2016

        OUTPUT  :

        Subat 2016 29 Gundur.*/

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen ay numarası giriniz");
        int ay = input.nextInt();

        System.out.println("Lütfen yıl numarası giriniz");
        int yıl = input.nextInt();

        switch (ay){

            case 1:
                System.out.println("Ocak " + yıl + " 31 Gundur.");
                break;
            case 3:
                System.out.println("Mart " + yıl + " 31 Gundur.");
                break;
            case 5:
                System.out.println("Mayıs " + yıl + " 31 Gundur.");
                break;
            case 7:
                System.out.println("Temmuz " + yıl + " 31 Gundur.");
                break;
            case 8:
                System.out.println("Ağustos " + yıl + " 31 Gundur.");
                break;
            case 10:
                System.out.println("Ekim " + yıl + " 31 Gundur.");
                break;

            case 12:
                System.out.println("Aralık " + yıl + " 31 Gundur.");
                break;
            case 4:
                System.out.println("Nisan " + yıl + " 30 Gundur.");
                break;
            case 6:
                System.out.println("Haziran " + yıl + " 30 Gundur.");
                break;
            case 9:
                System.out.println("Eylül " + yıl + " 30 Gundur.");
                break;
            case 11:
                System.out.println("Kasım " + yıl + " 30 Gundur.");
                break;
            case 2:
                if (yıl%4==0){
                    System.out.println("Şubat " + yıl + " 29 Gundur.");
                }else {
                    System.out.println("Şubat " + yıl + " 28 Gundur.");
                }
                break;
            default:
                System.out.println("Lütfen geçerli bir ay numarası giriniz");
        }











    }
}
