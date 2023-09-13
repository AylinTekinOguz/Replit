import java.util.Scanner;

public class Forwhile1 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

    char ch1= 'a' ;

		String name =“John came late"

		Expected Output:


    Number of a = 2
         */

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        char ch1= input.next().charAt(0);

        int counter = 0;
        for (int i = 0; i < name.length(); i++) {
           if (name.charAt(i)==ch1){
               counter++;
           }

        }
        System.out.println("Number of a = " + counter);





    }
}
