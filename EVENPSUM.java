package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EVENPSUM {
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
                int A = sc.nextInt();
                int B = sc.nextInt();

                int count = 0;
                 for(int i = 1;i<=A;i++){
                     for(int j = 1;j<=B;j++){
                         if((i+j) % 2 == 0)
                             count++;
                     }
                 }
                 System.out.println(count);
            }

        }
        catch(Exception ignored){

        }
    }
}
