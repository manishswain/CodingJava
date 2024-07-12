package Codevita;
import java.util.*; 
  
class GFG{ 
static int[] dist; 
static boolean[] vis; 
static void dfs(int u, Vector<Integer>[] Adj, int s) 
{ 
    vis[u] = true; 
    for (int it : Adj[u]) 
    { 
        if (vis[it] == false) 
        { 
            dfs(it, Adj, s + 1); 
        } 
    } 
    dist[u] = Math.max(dist[u], s); 
} 
static void minFarthestDistance(int[][] arr, int n)  
{ 
    dist = new int[n + 1]; 
    Arrays.fill(dist, 0); 
    @SuppressWarnings("unchecked") 
    Vector<Integer>[] Adj = new Vector[n + 1]; 
  
    for(int i = 0; i < n + 1; i++) 
    { 
        Adj[i] = new Vector<>(); 
    } 
    for(int i = 0; i < n - 1; i++)  
    { 
        Adj[arr[i][0]].add(arr[i][1]); 
        Adj[arr[i][1]].add(arr[i][0]); 
    } 
    for(int i = 1; i <= n; i++)  
    { 
        vis = new boolean[n + 1]; 
        Arrays.fill(vis, false); 
        dfs(i, Adj, 0); 
    } 
  
    int min = Integer.MAX_VALUE; 
    for(int i = 1; i < dist.length; i++)  
    { 
        if (dist[i] < min) 
            min = dist[i]; 
    } 
    System.out.println(min); 
}  
public static void main(String[] args)  
{ 
      
    Scanner sc=new Scanner(System.in);
    int N = sc.nextInt(); 
    int[][] arr = new int[N-1][2];
    for(int i=0;i<N-1;i++)
    {
        for(int j=0;j<2;j++)
        {
            arr[i][j]=sc.nextInt();
        }
    } 
    minFarthestDistance(arr, N); 
    sc.close();
} 
} 
  