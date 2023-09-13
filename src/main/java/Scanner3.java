import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
       /* Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.

                Örnek Çıktı:

        Alan: 32

        Çevre: 24

        */

        Scanner input = new Scanner(System.in);

        int kisaKenar = input.nextInt();
        int uzunKenar = input.nextInt();

        System.out.println("Alan: " + (kisaKenar*uzunKenar));
        System.out.println("Cevre: "+ ((kisaKenar+uzunKenar)*2));

    }
}
