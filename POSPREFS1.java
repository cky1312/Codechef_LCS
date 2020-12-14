package Codechef;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;

//import static java.lang.System.out;

public class POSPREFS1
{
    static class Reader
    {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException
        {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException
        {
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c;
            while ((c = read()) != -1)
            {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
            {
                ret = ret * 10 + c - '0';
            }  while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');

            if (c == '.')
            {
                while ((c = read()) >= '0' && c <= '9')
                {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }

    public static void main(String[] args) throws IOException
    {
        try(OutputStream out = new BufferedOutputStream(System.out)) {
            Reader sc = new Reader();
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();

                int[] arr = new int[n + 1];

                for (int i = 1; i <= n; i++) {
                    arr[i] = -(i);
                }

                if (k == 1) {
                    arr[1] = -(arr[1]);
                    for (int i = 1; i <= n; i++) {
                        out.write((arr[i] + " ").getBytes(StandardCharsets.UTF_8));
                    }
                    out.write(("\n").getBytes(StandardCharsets.UTF_8));
                } else if (k == 2) {
                    arr[1] = -(arr[1]);
                    arr[2] = -(arr[2]);
                    for (int i = 1; i <= n; i++) {
                        out.write((arr[i] + " ").getBytes(StandardCharsets.UTF_8));
                    }
                    out.write(("\n").getBytes(StandardCharsets.UTF_8));
                } else if (k == n) {
                    for (int i = 1; i <= n; i++) {
                        out.write((-(arr[i]) + " ").getBytes(StandardCharsets.UTF_8));
                    }
                    out.write(("\n").getBytes(StandardCharsets.UTF_8));
                } else {
                    arr[1] = -(arr[1]);
                    arr[2] = -(arr[2]);

                    int k2 = k - 2, j = 4;

                    while (k2 != 0 && j <= n) {
                        arr[j] = -(arr[j]);
                        k2--;
                        j += 2;
                    }

                    if (k2 > 0) {
                        for (int i = n; i >= 1; i--) {
                            if (arr[i] < 0) {
                                arr[i] = -(arr[i]);
                                k2--;
                            }

                            if (k2 == 0) {
                                break;
                            }
                        }

                        for (int l = 1; l <= n; l++) {
                            out.write((arr[l] + " ").getBytes(StandardCharsets.UTF_8));
                        }
                        out.write(("\n").getBytes(StandardCharsets.UTF_8));
                    } else {
                        for (int l = 1; l <= n; l++) {
                            out.write((arr[l] + " ").getBytes(StandardCharsets.UTF_8));
                        }
                        out.write(("\n").getBytes(StandardCharsets.UTF_8));
                    }
                }
            }
        }
        catch (Exception e){

        }
    }
} 