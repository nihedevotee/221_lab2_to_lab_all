import java.io.*;
import java.util.StringTokenizer;

public class CountInversionRevisited
{
  private static long mergeSort (int [] a) 
  {
    int sz = a.length;
    if (sz<2)
    {
      return 0;
    }
    
    int mid =sz/2;
    int [] lh = new int[mid];
    int [] rh = new int[sz-mid];
    
    for (int i=0; i<sz; i++)
    {
      if (i<mid)
      {
        lh[i] = a[i];
      }
      else
      {
        rh[i-mid] = a[i];
      }
    }
    
    return mergeSort(lh) + mergeSort(rh) + merge(a, lh, rh);
  }
  
  public static long merge(int [] a, int [] lh, int [] rh)
  {
    int ls = lh.length;
    int rs = rh.length;
    long  c  = 0;  
    
    int i =0, j =0, k = 0;
    
    int j_high = 0;
    for (int x = 0; x<ls; x++)
    {
      if (lh[x] > 0)
      {
        long val = (long)lh[x] - 1;
        long limit = (long) Math.floor(Math.sqrt(val));
        int j_low = lower_bound(rh, -limit);
        while (j_high < rs && rh[j_high] <= limit)
        {
          j_high++;
        }
        c += (j_high - j_low);
      }
    }
    
    while (i<ls && j<rs)
    {
      if (lh[i]<=rh[j])
      {
        a[k++] = lh[i++];
      }
      else
      {
        a[k++] = rh[j++];
      }
    }
    
    while (i<ls)
    {
      a[k++] = lh[i++];
    }
    
    while (j<rs)
    {
      a[k++] = rh[j++];
    }
    
    return c;
  }
  
  private static int lower_bound(int[] arr, long val)
  {
    int l = 0, r = arr.length;
    while (l < r)
    {
      int m = l + (r - l) / 2;
      if (arr[m] < val)
      {
        l = m + 1;
      }
      else
      {
        r = m;
      }
    }
    return l;
  }
  
  public static void main (String [] args) throws Exception
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter (System.out);
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    
    int [] a = new int [N];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i<N; i++)
    {
      a[i] = Integer.parseInt(st.nextToken());
    }
    
    long inv = mergeSort(a);  
    pw.println(inv);
    
    pw.flush();
    br.close();
    pw.close();
  }
}