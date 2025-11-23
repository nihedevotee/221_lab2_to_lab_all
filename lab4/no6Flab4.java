import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.StringTokenizer;

public class no6Flab4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int count=0;

        ArrayList <String> list = new ArrayList<>();

        //for (int i = 0; i < 8; i++) {
            
            if (x-1!=0 && y-1!=0) {
                count++;
                list.add((x-1)+" "+(y-1));
            }
            if (x-1!=0) {
                count++;
                list.add((x-1)+" "+(y));
            }
            if (x-1!=0 && y+1<=n) {
                count++;
                list.add((x-1)+" "+(y+1));
            }

            if (y-1!=0) {
                count++;
                list.add((x)+" "+(y-1));
            }
            if (y+1<=n) {
                count++;
                list.add((x)+" "+(y+1));
            }

            if (x+1<=n && y-1!=0) {
                count++;
                list.add((x+1)+" "+(y-1));
            }
            if (x+1<=n) {
                count++;
                list.add((x+1)+" "+(y));
            }
            if (x+1<=n && y+1<=n) {
                count++;
                list.add((x+1)+" "+(y+1));
            }
        //}
        pw.println(count);
        for (int i = 0; i < list.size(); i++) {
            pw.println(list.get(i));
        }

    }
}
