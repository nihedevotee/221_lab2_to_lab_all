import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class no2Blab3VHULL {
    public static long count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long arr[] = new long[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        mergeSort(arr, 0, n - 1);

        pw.println(count);

    }

    public static void mergeSort(long a[], int l, int r) {

        if (l < r) {
            int mid = (l + r) / 2;

            mergeSort(a, l, mid);
            mergeSort(a, mid + 1, r);
            counting(a, l, mid, r);
            merge(a, l, mid, r);
        }
    }

    public static void counting(long[] a, int l, int mid, int r) {

        int n1 = mid - l + 1;
        int n2 = r - mid;

        long[] left = new long[n1];
        long[] right = new long[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = a[l + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = a[mid + 1 + j];
        }

        int j = 0;
        for (int i = 0; i < n1; i++) {
            while (j < n2 && left[i] > right[j] * right[j]) {
                j++;
            }
            count += j; 
        }
    }

    public static void merge(long a[], int l, int mid, int r) {

        int n1 = mid - l + 1;
        int n2 = r - mid;

        long left[] = new long[n1];
        long right[] = new long[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = a[l + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = a[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];

            }
        }
        while (i < n1) {
            a[k++] = left[i++];
        }
        while (j < n2) {
            a[k++] = right[j++];
        }
    }
}
