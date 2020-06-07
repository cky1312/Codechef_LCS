package Codechef;

import java.util.*;
public class XYSTR {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            sc.nextLine();
            while(t-- > 0){
                String str = sc.nextLine();
                int n = str.length();
                int count = 0,i=0;
                String c = "xy",c1 = "yx";
                while(i < n-1){
                    String sub = str.substring(i,i+2);
                    if(sub.equals(c) || sub.equals(c1)) {
                        count++;
                        i += 2;
                    }
                    else
                        i++;
                }
                System.out.println(count);
            }
        }
        catch (Exception e){

        }
    }
}
