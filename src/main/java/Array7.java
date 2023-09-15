import java.util.ArrayList;

public class Array7 {
    public static void main(String[] args) {
        /*Array i ARRAYLIST e çeviren Java Kodunu yazınız.

Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]

```
Beklenen Çıktı:
```

```
[Python, JAVA, PHP, Perl, C#, C++] */

        String arr[] = {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};

        ArrayList <String> newArr = new ArrayList<>();

        for (String w:arr) {
            newArr.add(w);
        }

        System.out.println(newArr);

    }
}
