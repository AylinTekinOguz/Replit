import java.util.Scanner;

public class Forwhile4 {
    public static void main(String[] args) {
        /*
        Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.

Input : 6

Output: 6!=6*5*4*3*2*1=720
         */

        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();

        int carpim = 1;

        for (int i = sayi; i >0 ; i--) {
            carpim=carpim*i;
        }

        System.out.println("6!=6*5*4*3*2*1="+carpim);



    }
}
