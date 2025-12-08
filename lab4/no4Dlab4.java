import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
//import java.util.ArrayList;
import java.util.StringTokenizer;
public class no4Dlab4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // read N (nodes) and M (edges)
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // degree array: how many roads each house has
        int[] degree = new int[N + 1];

        // read first endpoints (u array)
        int[] u = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            u[i] = Integer.parseInt(st.nextToken());
        }

        // read second endpoints (v array)
        int[] v = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            v[i] = Integer.parseInt(st.nextToken());
        }

        // Count degree
        // every edge (u, v) adds 1 degree to u and 1 degree to v
        for (int i = 0; i < M; i++) {
            degree[u[i]]++;
            degree[v[i]]++;
        }

        // Count how many nodes have odd degree
        int oddCount = 0;
        for (int i = 1; i <= N; i++) {
            if (degree[i] % 2 != 0) oddCount++;
        }

        // Euler Path exists only if oddCount is 0 or 2
        if (oddCount == 0 || oddCount == 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

