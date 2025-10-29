import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class no3Clab2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int arr[] = new int[Integer.parseInt(st.nextToken())];
        int target=Integer.parseInt(st.nextToken());

        for (int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(st2.nextToken());

        int i=0;
        int j=arr.length-1;
        int k=i+1;
        while((i<arr.length && j>=0) &&k<arr.length){
            int sum= arr[i]+arr[j]+arr[k];
            if (sum==target) {
                pw.println((i+1)+" "+(k+1)+" "+(j+1));
                return;
            }
            else{
                i++;j--;k++;
            }
        }
        pw.println("-1");
    }
}
