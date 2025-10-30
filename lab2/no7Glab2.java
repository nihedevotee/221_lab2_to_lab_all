import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class no7Glab2 {
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
            int k=x-1;
            while (j<k) {
                //for (int k2 = 0; k2 < arr.length; k2++) {
                    if (arr[j]>=a && arr[k]<=b) {
                        pw.println(k-j+1);
                        //return;
                        //continue;
                        break;
                    }
                    else if (arr[j]<=a) {
                        j++;
                    }
                    else if (arr[k]>=b) {
                        k--;
                    }
                //}
            }
        }
    }
}
