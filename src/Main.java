import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {26,8,33,92,-26,10,64,-46};
        int min = list[0];
        int max = list[0];
        for (int n :list){
            if (n<min){
                min = n;
            }
            if (n>max){
                max = n;
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        System.out.println("================================");


        // Pratic - Ödev
        // Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve
        // büyük en yakın sayıyı bulan programı yazınız.

        int[] list2 = {26,8,33,92,-26,10,64,-46, 38, 5, 50, -3, 100, -15};
        // -46,-26,8,10,26,33,92
        Arrays.sort(list2);
        Scanner input =new Scanner(System.in);
        System.out.print("Enter any number : ");
        int a = input.nextInt();
       for (int i = 0; i<list2.length; i++){
           if (a<list2[i]){
               System.out.println("Girilen sayıdan küçük en yakın sayı : " + list2[i-1]);
               System.out.println("Girilen sayıdan büyük en yakın sayı : " + list2[i]);
               break;
           }
       }

    }
}