package org.example;
/*


Bu program, ilk n Cullen sayısını hesaplar. Cullen sayıları, n * 2^n + 1 formülüyle verilir. Örneğin, C1 = 3, C2 = 9, C3 = 25 gibi.
Aşağıdaki program, n'i 10 olarak ayarladığımızda ilk on Cullen sayısını hesaplar ve ekrana yazdırır. Bu sayılar oldukça büyük olabilir,
bu yüzden BigInteger sınıfını kullanarak büyük sayıları temsil etmek için BigInteger.valueOf() ve BigInteger.pow() yöntemlerini
kullanıyoruz.
*/

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        int n = 10; // İlk n Cullen sayısını bulmak için
        for (int i = 1; i <= n; i++) {
            BigInteger cullen = cullenSayisiHesapla(i);
            System.out.println("C" + i + " = " + cullen);
        }
    }

    // Cullen sayısını hesaplayan metot
    public static BigInteger cullenSayisiHesapla(int n) {
        // Cn = n * 2^n + 1
        BigInteger base = BigInteger.valueOf(2);
        BigInteger exponent = base.pow(n).multiply(BigInteger.valueOf(n));
        return exponent.add(BigInteger.ONE);
    }
}