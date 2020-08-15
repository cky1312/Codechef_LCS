package Codechef;

import java.util.Scanner;

public class LINCHESS {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-- > 0){
                int n = sc.nextInt();
                int k = sc.nextInt();
                int res = Integer.MAX_VALUE;
                int[] arr = new int[n];
                for(int i=0;i<n;i++)
                    arr[i] = sc.nextInt();
                int start = 0;
                for(int i=0;i<n;i++){
                    int count;
                    if(arr[i] < k){
                        if(k%arr[i] == 0){
                            count = ((k / arr[i]) - 1);
                            if(count < res){
                                res = count;
                                start = arr[i];
                            }
                        }
                    }
                }
                if(start != 0)
                    System.out.println(start);
                else
                    System.out.println(-1);
            }
        }
        catch (Exception ignored){

        }
    }
}
