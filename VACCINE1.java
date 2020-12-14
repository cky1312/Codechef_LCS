package Codechef;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class VACCINE1 {
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
            FastReader s = new FastReader();
            int D1 = s.nextInt();
            int V1 = s.nextInt();
            int D2 = s.nextInt();
            int V2 = s.nextInt();
            int P = s.nextInt();

            int sum = 0, c = 0;
            for(int i=0;;){
                if(i >= D1)
                    sum += V1;
                if(i >= D2)
                    sum += V2;
                c++;
                if(sum >= P)
                    break;
            }
            System.out.println(c);
        }
        catch(Exception ignored){

        }
    }
}
