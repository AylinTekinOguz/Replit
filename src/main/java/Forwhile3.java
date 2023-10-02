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
            char c = str.charAt(i);
            // Eğer karakter daha önce işlenmemişse
            if (str.indexOf(c) == i && str.lastIndexOf(c) != i) {
                tekrarli += c+" ";
            }
        }
        System.out.println(tekrarli);
    }

    }

