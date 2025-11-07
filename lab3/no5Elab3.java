import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class no5Elab3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            long a = Long.parseLong(st.nextToken());
            long n = Long.parseLong(st.nextToken());
            long m = Long.parseLong(st.nextToken());

            if (a == 1) {
                pw.println(n % m);
            } else {
                long num=(expo(a, n + 1, m) - a + m) % m;
                long deno= (a-1 + m)% m;
                long inv= expo (deno,m-2,m);
                //long inv = modInverse(deno, m);
                long sum = (num * inv)%m;

                // sum=sum%m;
                // if (sum<0) {
                //     sum = sum + m;
                // }
                pw.println(sum);
            }
        }
    }

    // public static long expo(long a, long b, long m) {
    //     if (b == 0) {
    //         return 1;
    //     }
    //     a=a%m;

    //     long mid = b / 2;
    //     long y = expo(a, mid, m);
    //     long x = y * y;

    //     if (b % 2 == 0) {
    //         return x % m;
    //     } else {
    //         return (x * a) % m;
    //     }
    // }
    public static long expo(long a, long b, long m) {
        long res = 1;
        a %= m;
        while (b > 0) {
            if ((b % 2) == 1) res = (res * a) % m;
            a = (a * a) % m;
            b = b/2;
        }
        return res;
    }

}
