package Giris;
import java.util.Scanner;
public class KombinasyonHesaplama {
    public static void main(String[] args) {
        Scanner baba = new Scanner(System.in);
        int n,r;
        int totaln = 1;
        int totalr = 1;
        int totalnr = 1;
        System.out.print("N sayısını girin : ");
        n = baba.nextInt();
        System.out.print("R sayısını girin : ");
        r = baba.nextInt();

        for(int i = 1; i <= n; i++){
            totaln *= i;
        }
        for(int m = 1; m <= r; m++){
            totalr *= m;
        }
        for(int s=1; s <= (n-r); s++){
            totalnr *= s;
        }
        double kombinasyon = totaln / (totalr * totalnr);

        System.out.println("Kombinasyon C(N,R) : " + kombinasyon);
    }
}
