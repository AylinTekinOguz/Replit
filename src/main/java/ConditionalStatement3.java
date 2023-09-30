import java.util.Scanner;

public class ConditionalStatement3 {
    /*
    Girilen 3 sayıdan en büyüğünü bulan Java Kodunu yazınız.
Test Data:
12
34
23
Beklenen Çıktı:
En Buyuk Sayi: 34
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        int max =Math.max(Math.max(num1, num2) , num3);

        System.out.println("En Buyuk Sayi: "+max);





    }
}