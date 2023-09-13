import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.

Ornek Cikti :

Alan: 9

Cevre: 12
         */

        Scanner input =new Scanner(System.in);

        int kenar = input.nextInt();


        System.out.println("Alan: " + (kenar*kenar));
        System.out.println("Cevre: " + ((kenar+kenar)*2));
    }
}
