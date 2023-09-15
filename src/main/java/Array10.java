import java.util.Arrays;

public class Array10 {
    public static void main(String[] args) {
        /*
        Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.

```
Test Data:
```

```
sentence -> "Java is fun"
```

```
reversed **-> "**fun is Java**"**
         */

        String s ="Java is fun";
        String reversed = "";

       String arr[]= s.split(" ");

        System.out.println(Arrays.toString(arr)); //[Java, is, fun]

        for (int i = arr.length-1; i >=0; i--) {
            reversed=reversed+arr[i]+" ";
        }
        System.out.println(reversed);



    }
}
