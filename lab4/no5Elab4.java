import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
//import java.util.ArrayList;
import java.util.StringTokenizer;

public class no5Elab4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringTokenizer st3 = new StringTokenizer(br.readLine());

        int x=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());

        //int [] arr= new int [k];
        int [] in= new int [x+1];
        int [] out = new int [x+1];

        
        for (int i = 0; i < k; i++) {
            int u = Integer.parseInt(st2.nextToken());
            int v = Integer.parseInt(st3.nextToken());
            in[v]++;
            out[u]++;
        }
        for (int i = 1; i <= x; i++) {
            pw.print(in[i]-out[i]+" ");
            pw.flush();
        }
    }
    
}
