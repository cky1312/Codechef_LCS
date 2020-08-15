package Codechef;

import java.util.Scanner;

public class CRDGAME3 {
    public static void main(String[] args) {
        try{
            Scanner sc =  new Scanner(System.in);
            int t = sc.nextInt();
            while(t-- > 0) {
                int Pc = sc.nextInt();
                int Pr = sc.nextInt();
                int Pccount = 0, Prcount = 0;
                if (Pc <= 9 && Pr <= 9) {
                    System.out.println(1 + " " + 1);
                } else {
                    if (Pc % 9 == 0) {
                        Pccount = Pc / 9;
                    } else {
                        Pccount = Pc / 9 + 1;
                    }
                    if (Pr % 9 == 0) {
                        Prcount = Pr / 9;
                    } else {
                        Prcount = Pr / 9 + 1;
                    }
                    if (Pccount < Prcount)
                        System.out.println(0 + " " + Pccount);
                    else
                        System.out.println(1 + " " + Prcount);
                }
            }
        }
        catch (Exception ignored){

        }
    }
}
