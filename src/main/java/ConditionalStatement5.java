import java.util.Scanner;
/*1 ile 12 arasında girilen sayıdan ve yıldan  yılın hangi ayı olduğunun ve  o yıl bu ayın kaç gün olduğunu hesaplayan Java kodunu yazınız.
Ocak, Mart, Mayıs, Temmuz, Ağustos, Ekim, Aralık-->31
Nisan, Haziran, Eylül, Kasım -->30
Şubat-->yılın 4e bölümünden kalan 0 ise 29 değilse 28

        Test Data:
        2
        2016
        Beklenen çıktı:
        2016 yili Subat ayi 29 gun
        Test Data:
        4
        1998
        Beklenen Çıktı:
        1998 yili Nisan ayi 30 gun*/
public class ConditionalStatement5 {
    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int year = input.nextInt();

        switch (month){
            case 1:
                System.out.println(year+" yili Ocak ayi 31 gun");
                break;
            case 3:
                System.out.println(year+" yili Mart ayi 31 gun");
                break;
            case 5:
                System.out.println(year+" yili Mayis ayi 31 gun");
                break;
            case 7:
                System.out.println(year+" yili Temmuz ayi 31 gun");
                break;
            case 8:
                System.out.println(year+" yili Ağustos ayi 31 gun");
                break;
            case 10:
                System.out.println(year+" yili Ekim ayi 31 gun");
                break;
            case 12:
                System.out.println(year+" yili Aralik ayi 31 gun");
                break;
            case 4:
                System.out.println(year+" yili Nisan ayi 30 gun");
                break;
            case 6:
                System.out.println(year+" yili Haziran ayi 30 gun");
                break;
            case 9:
                System.out.println(year+" yili Eylul ayi 30 gun");
                break;
            case 11:
                System.out.println(year+" yili Kasim ayi 30 gun");
                break;
            case 2:
                if (year%4==0){
                    System.out.println(year+" yili Subat ayi 29 gun");
                }else {
                    System.out.println(year+" yili Subat ayi 28 gun");
                }

        }







    }
}
