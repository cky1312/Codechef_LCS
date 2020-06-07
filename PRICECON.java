package Codechef;

import java.util.*;
public class PRICECON {
    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int ar[] = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = sc.nextInt();
            }
            int initialSum = 0;
            for (int i = 0; i < n; i++) {
                initialSum += ar[i];
            }
            for (int i = 0; i < n; i++) {
                if (ar[i] > k)
                    ar[i] = k;
            }
            int finalSum = 0;
            for (int i = 0; i < n; i++) {
                finalSum += ar[i];
            }
            int difference = initialSum - finalSum;
            System.out.println(difference);
        }
        }
        catch (Exception e){

        }
    }
}
