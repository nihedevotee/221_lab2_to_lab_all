import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class no7Glab2VHULL {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int x= Integer.parseInt(st.nextToken());
        int y= Integer.parseInt(st.nextToken());
        
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int arr[] = new int[x];
        for (int i = 0; i < x; i++) arr[i] = Integer.parseInt(st2.nextToken());
        
        for (int i = 0; i < y; i++) {
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st3.nextToken());
            int b=Integer.parseInt(st3.nextToken());

            int j=0;
            int n = arr.length;

            while (j < n && arr[j] < a) {
                j++;
            }

            int k = n - 1;
            while (k >= 0 && arr[k] > b) {
                k--;
            }

            int count = 0;
            if (j <= k) {
                count = k - j + 1;
            } 
            pw.println(count);
        }
            pw.flush();
    }
}
