public class ConditionalStatement9 {
    public static void main(String[] args) {
      /*  Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
        Test Data:
        Yarım elmas uzunluğu : 7
        Beklenen Çıktı:
      *
     ***
    *****
   *******
  *********
 ***********
*************
 ***********
  *********
   *******
    *****
     ***
      *
        */

        int n = 13; // Yükseklik
        int k = n / 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < Math.abs(k - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - 2 * Math.abs(k - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
