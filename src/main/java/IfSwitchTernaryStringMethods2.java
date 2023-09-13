import java.util.Scanner;

public class IfSwitchTernaryStringMethods2 {
    public static void main(String[] args) {
        /*Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.

                Input :

        John White

        1234234534561478

        Output :
        Name :J*** W****

        CCN  : **** **** **** 1478

                * Ilk Harfler Buyuk harf ile baslamalidir.*/

        Scanner input = new Scanner(System.in);

        String ad = input.next();
        String soyad = input.next();
        String kartNo = input.next();

        ad= ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase().replaceAll("[a-z]","*");

        soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase().replaceAll("[a-z]","*");

       String ilkDort = kartNo.substring(0,4);
       String dortSekiz = kartNo.substring(4,8);
       String sekizOniki = kartNo.substring(8,12);
       String sonDort = kartNo.substring(12);

       ilkDort = ilkDort.replaceAll("[0-9]", "*");
        dortSekiz = dortSekiz.replaceAll("[0-9]", "*");
        sekizOniki = sekizOniki.replaceAll("[0-9]", "*");

        kartNo = ilkDort + " " + dortSekiz + " " + sekizOniki+ " "+sonDort;

        System.out.println(ad+ " " + soyad);
        System.out.println("CCN : " + kartNo);










    }


}
