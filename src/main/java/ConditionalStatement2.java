import java.util.Scanner;

public class ConditionalStatement2 {
    public static void main(String[] args) {
       /*
       iki sayıyı kıyaslayan Java kodunu yazınınz.
**Kullanılacak Operatörler**
**Büyüktür >**
**Küçüktür <**
**Büyük yada eşit =>**
**Küçük yada eşit =<**
**Eşittir ==**
**Eşit değildir !=**
**Kullanılacak sayılar 25 ile 39**
Beklenen Örnek Çıktı:
25 != 39
25 < 39
25 <= 39
        */

        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        if (number1==number2){
            System.out.println(number1+"=="+number2);
        }else {
            System.out.println(number1+"!="+number2);
        }

        if (number1<number2){
            System.out.println(number1+"<"+number2);
        }else if (number1>number2){
            System.out.println(number1+">"+number2);
        }else {

        }

        if (number1<=number2){
            System.out.println(number1+"<="+number2);
        }

        if (number1>=number2){
            System.out.println(number1+">="+number2);
        }


    }

}
