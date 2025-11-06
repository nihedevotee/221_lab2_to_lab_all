import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class no4Dlab3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long c = Long.parseLong(st.nextToken());
            long d = Long.parseLong(st.nextToken());
            long X= Long.parseLong(br.readLine());

            long store= expo(a,b,c,d,X);

        }
    }
    public static long expo(long a,long b,long c,long d,long X){
        if (X==1) { 
            return 0;
        }
        long half= expo(a,b,c,d,X/2);
        long result= multiply(half, half);

        if (X%2==1) {
            result = multiply(res,a,b,c,d,X)
        }
        
        return 0;
    }
    public static ArrayList<String> multiply(long a,long b,long c,long d,long X){

        
        return null;
        
    }

}
