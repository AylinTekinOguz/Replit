import java.util.Scanner;

public class Scanner7 {
    public static void main(String[] args) {
        //Kullanıcı tarafından girilen DOUBLE sayıyı tam sayıya çeviren bir program yazınız.

        Scanner input = new Scanner(System.in);

        double sayi = input.nextDouble();

        int tamsayi = (int) sayi;

        System.out.println(tamsayi);
    }
}
