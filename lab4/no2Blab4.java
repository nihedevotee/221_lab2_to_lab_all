import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class no2Blab4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        StringTokenizer st4 = new StringTokenizer(br.readLine());

        // ArrayList <String> a1= new ArrayList<>();
        int arr[] = new int[m];
        String arrayOut[] = new String[n+1];
        int arr2[] = new int[m];
        int arr3[] = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
            arr2[i] = Integer.parseInt(st3.nextToken());
            arr3[i] = Integer.parseInt(st4.nextToken());
        }

        // ArrayList<String> adj = new ArrayList<>();
        // for (int i = 0; i <= n; i++) {
        // adj.add("");
        // }

        for (int i = 0; i < m; i++) {
            String edge = "(" + arr2[i] + "," + arr3[i] + ") ";
            if (arrayOut[arr[i]] == null) {
                arrayOut[arr[i]] = "" + edge;
            } else {
                arrayOut[arr[i]] = arrayOut[arr[i]] + edge;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arrayOut[i+1]==null) {
                arrayOut[i+1]="";
            }
            pw.println((i + 1) + ": " + arrayOut[i + 1]);
        }

    }
}
