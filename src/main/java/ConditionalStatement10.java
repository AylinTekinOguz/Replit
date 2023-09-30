import java.util.Scanner;

public class ConditionalStatement10 {
    public static void main(String[] args) {
        /*
        5 satırlık paskal üçgenini yazdıran Java kodunu yazınız.
Beklenen Çıktı:
      1
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç satır görmek istersiniz? ");
        int rows = input.nextInt();

        for (int i = 0; i < rows; i++) {
            // Boşlukları ekle
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

            int num = 1;
            for (int k = 0; k <= i; k++) {
                System.out.print(num + " ");
                num = num * (i - k) / (k + 1);
            }
            System.out.println();
        }





    }
}
