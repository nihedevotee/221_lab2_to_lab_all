 import java.io.*;
import java.util.*;
 
public class pA {
    static StringBuilder sb=new StringBuilder();
    static int [] vis;
 
    public static void bfs(ArrayList<Integer>[] g,int ver){
        Queue<Integer> q = new LinkedList<>();
        q.add(ver);
        vis[ver]=1;
        while (!q.isEmpty()) {
            int u=q.poll();
            sb.append(u+" ");
            for (int v : g[u]) {
                if(vis[v]==0){
                    vis[v]=1;
                    q.add(v);
                }
                
            }
            
        }
    }
    public static void main(String[] args) throws Exception {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        vis=new int[N+1];
        ArrayList<Integer>[] adj = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj[u].add(v);
            adj[v].add(u);
        }
 
        bfs(adj,1);
        out.println(sb.toString());
        out.flush();
        out.close();
        br.close();
 
    }
 
} {
    
}
