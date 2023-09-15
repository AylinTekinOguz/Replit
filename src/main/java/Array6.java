import java.util.Arrays;

public class Array6 {
    public static void main(String[] args) {
      /*  Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.

                Array: [12,15,43,23,56,76,78,90,77,43]

```
        Aranan değer:56
```

```
        Beklenen Çıktı:
```

```
        56 sayısı arrayin 4. elemanı*/


        int arr []= {12,15,43,23,56,76,78,90,77,43};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[12, 15, 23, 43, 43, 56, 76, 77, 78, 90]

        int arananDeger = 56;

        int kacinciEleman = Arrays.binarySearch(arr,arananDeger);

        System.out.println(arananDeger+ " sayısı arrayin " + kacinciEleman + " elemanı"); //56 sayısı arrayin 5 elemanı
    }
}
