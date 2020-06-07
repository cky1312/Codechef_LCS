package Codechef;

import java.util.*;
public class CHFICRM {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int sum = 0;
                int ar[] = new int[n];
                for (int i = 0; i < n; i++) {
                    ar[i] = sc.nextInt();
                }

                int sum5=0,sum10=0,sum15=0;
                for(int i=0;i<n;i++){
                    if(ar[i]==5){
                        sum5++;
                        if(i==n-1){
                            System.out.println("YES");
                            break;
                        }
                    }
                    if(ar[i]==10){
                        if(sum5>0) {
                            sum10++;
                            sum5--;
                            if(i==n-1){
                                System.out.println("YES");
                                break;
                            }
                        }
                        else {
                            System.out.println("NO");
                            break;
                        }
                    }
                    if(ar[i]==15){
                        if(sum10>0 || sum5>1){
                            if(sum10>0)
                                sum10--;
                            sum5 -=2;

                            if(i==n-1){
                                System.out.println("YES");
                                break;
                            }
                        }
                        else{
                            System.out.println("NO");
                        }
                    }
                }

            }
        }
        catch (Exception e){

        }
    }
}
