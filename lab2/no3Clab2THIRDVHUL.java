import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class no3Clab2THIRDVHUL {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int arr[] = new int[Integer.parseInt(st.nextToken())];
        int target = Integer.parseInt(st.nextToken());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        for (int i = 0; i < arr.length; i++) {
            int j=i+1;
            int k=j+1;
            int sum=target-(arr[i]);
            
            while (j<arr.length && k<arr.length) {
                if (sum==(arr[j]+arr[k])){
                    pw.println((i+1)+" "+(j+1)+" "+(k+1));
                    return;
                }
                else{
                    if (k<arr.length) {
                        k++;
                    }
                }
                j++;
                k=j+1;
            }
        }
    }
}
