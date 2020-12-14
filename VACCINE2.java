package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class VACCINE2 {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        try{
            FastReader sc = new FastReader();
            int t = sc.nextInt();
            while(t-- > 0){
                int N = sc.nextInt();
                int D = sc.nextInt();
                int[] arr = new int[N];
                for(int i = 0; i < N; i++){
                    arr[i] = sc.nextInt();
                }
                int atRisk = 0, notAtRisk = 0;
                for(int i = 0; i < N; i++){
                    if(arr[i] >= 80 || arr[i] <= 9)
                        atRisk++;
                    else
                        notAtRisk++;
                }
                int minDays,ar = 0,nar = 0;
                if(atRisk%D>0)
                    ar = (atRisk/D) + 1;
                else ar = atRisk/D;
                if(notAtRisk%D>0)
                    nar = (notAtRisk/D) + 1;
                else nar = notAtRisk/D;

                minDays = ar + nar;
                System.out.println(minDays);
            }

        }
        catch(Exception ignored){

        }
    }
}
