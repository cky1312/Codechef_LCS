package Codechef;

import java.util.Scanner;

public class COVIDLQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] ar = new int[n];
            for(int i=0;i<n;i++){
                ar[i] = sc.nextInt();
            }
            int index = 0;
            for (int i = 0; i < n; i++) {
                if(ar[i] == 1){
                    index = i;
                    break;
                }
            }
            int c = 0,f = 1;
            for(int i= index+1;i<n;i++){
                if(ar[i] == 0)
                    c++;
                if(ar[i] == 1) {
                    if (c < 5) {
                        f = -1;
                        break;
                    }
                    else{
                        c=0;
                        continue;
                    }
                }
            }

            if(f == -1)
                System.out.println("No");
            else
                System.out.println("Yes");
        }
    }
}
