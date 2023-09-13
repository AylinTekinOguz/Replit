import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        //Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.

        Scanner input = new Scanner(System.in);

        int sayi=input.nextInt();

        System.out.println((sayi*sayi*sayi)/2);



    }
}
