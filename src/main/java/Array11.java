import java.util.Scanner;

public class Array11 {
    public static void main(String[] args) {
        /*
        Kullanıcının gireceği iki **binary** sayıyı toplayan  Java kodunu yazınız.

Test Data:
birinci binary number: 100010
ikinci  binary number: 110010
Beklenen Çıktı:
1010100
         */
        Scanner input = new Scanner(System.in);
        String binary1=input.next();
        String binary2=input.next();


       int a= Integer.parseInt(binary1,2);
       int b = Integer.parseInt(binary2,2);

        System.out.println(a);
        System.out.println(b);

        int sum = a+b;


        System.out.println(Integer.toBinaryString(sum));


    }
        
        
    }

