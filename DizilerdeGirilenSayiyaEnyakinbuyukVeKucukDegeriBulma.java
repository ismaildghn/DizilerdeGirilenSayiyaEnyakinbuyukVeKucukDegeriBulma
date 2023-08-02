import java.util.Scanner;
import java.util.Arrays;

public class DizilerdeGirilenSayiyaEnyakinbuyukVeKucukDegeriBulma {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);

        int[] list = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        int EnYakinBuyuk = list[0];
        int EnYakinKucuk = list[0];

        System.out.print("Bir sayi giriniz : ");
        int n = imp.nextInt();

        for (int i : list){
            if (n < i ) {
                EnYakinBuyuk = i;
                break;
            }
        }
            for(int m = list.length-1; m >= 0; --m){
                if(list[m] < n){
                    EnYakinKucuk = list[m];
                    break;
                }
            }
            System.out.println("En yakın büyük sayı : " + EnYakinBuyuk);
            System.out.println("En yakın küçük sayı : " + EnYakinKucuk);

    }
}
