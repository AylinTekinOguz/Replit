public class Forwhile3 {
    public static void main(String[] args) {
        /*
        Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)

Input :

String str=“Javaisalsoeasy”

Output: a s
         */

        String str = "Javaisalsoeasy";
        String tekrarli = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) != str.lastIndexOf(ch)) {
                tekrarli = tekrarli + ch;

            }

        }
        System.out.println(tekrarli); //aasasas

        String tekrarli2="";

        for (int i = 0; i < tekrarli.length(); i++) {
            char ch = str.charAt(i);
            if (tekrarli.indexOf(ch) != tekrarli.lastIndexOf(ch)) {
                tekrarli2 = tekrarli2 + ch;
            }

        }
        System.out.println(tekrarli2);
    }

    }

