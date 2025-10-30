import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class no8Hlab2 {
     public static void main(String[] args) throws IOException{   
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        int t= Integer.parseInt(br.readLine());
        
        for (int j = 0; j < t; j++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
        
            int k= Integer.parseInt(st.nextToken());
            int x= Integer.parseInt(st.nextToken());
            int i=1;
            int store=0;
            //ArrayList <Integer> list = new ArrayList<>();

            while (i<k) {
                if (i%x!=0) {
                    //list.add(i);
                    store = i;
                    //i++;
                } 
                i++;
            }
            pw.println(store);
        }
        
     }
}
