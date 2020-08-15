package Codechef;

import java.util.Scanner;

public class CHEFWARS {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-- > 0){
                int h = sc.nextInt();
                int p = sc.nextInt();
                while(p > 0 && h != 0){
                    if(h<p)
                        h=0;
                    else {
                        h = h - p;
                        p = p / 2;
                    }
                }
                if(h == 0)
                    System.out.println(1);
                else
                    System.out.println(0);
            }
        }
        catch(Exception ignored){

        }
    }
}
