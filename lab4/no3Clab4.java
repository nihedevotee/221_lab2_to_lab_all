import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
//import java.util.ArrayList;
import java.util.StringTokenizer;

public class no3Clab4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];

            int k = Integer.parseInt(st.nextToken()); // number of neighbors
            for (int j = 0; j < k; j++) {
                int x = Integer.parseInt(st.nextToken());
                arr[x] = 1;
            }
            for (int j2 = 0; j2 < n; j2++) {
                pw.print(arr[j2]+" ");
            }
            pw.println();
        }
    }
}
