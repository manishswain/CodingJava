package GraphTheoryFreeCodeCamp;
import java.util.*;
public class BfsAdjListPath 
{
    static class Edge
    {
        int from,to,cost;

        public Edge(int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }       
    }   
    private int n;
    private Integer prev[];
    private List<List<Edge>> graph;
    
    public BfsAdjListPath(List<List<Edge>> graph) 
    {
        if(graph == null ) throw new IllegalArgumentException("Graph cannot be null");
        this.n=graph.size();
        this.graph=graph;
    }

    public static void main(String[] args)
    {
        int n=13;
        List<List<Edge>> graph=createEmptyGraph(n);

        addUnweightedUndirectedEdge(graph,0,1);
        addUnweightedUndirectedEdge(graph,0,7);
        addUnweightedUndirectedEdge(graph,1,2);
        addUnweightedUndirectedEdge(graph,1,7);
        addUnweightedUndirectedEdge(graph,2,3);
        addUnweightedUndirectedEdge(graph,2,5);
        addUnweightedUndirectedEdge(graph,2,8);
        addUnweightedUndirectedEdge(graph,3,4);
        addUnweightedUndirectedEdge(graph,3,5);
        addUnweightedUndirectedEdge(graph,4,5);
        addUnweightedUndirectedEdge(graph,5,6);
        addUnweightedUndirectedEdge(graph,6,7);
        addUnweightedUndirectedEdge(graph,6,8);
        addUnweightedUndirectedEdge(graph,7,8);

        BfsAdjListPath solver;
        solver =new BfsAdjListPath(graph);

        int start=1,end =5;
        List<Integer> path=solver.reconstructPath(start , end );
        System.out.printf("The shortest path from %d to %d is: [%s]\n", start, end, formatPath(path)); 

    }

    private static String formatPath(List<Integer> path) {
        return String.join(
        " -> ", path.stream().map(Object::toString).collect(java.util.stream.Collectors.toList()));
    }

    private List<Integer> reconstructPath(int start, int end) 
    {
        bfs(start);
        List<Integer> path=new ArrayList<>();
        for(Integer at=end ;at!=null;at=prev[at])
        {
            path.add(at);
        }
        Collections.reverse(path);
        if(start==path.get(0))
        {
            return path;
        }
        path.clear();
        return path;    
    }

    private void bfs(int start) 
    {
        prev=new Integer[n];
        boolean visited[]=new boolean[n];
        Deque<Integer> queue = new ArrayDeque<Integer>();

        queue.offer(start);
        visited[start]=true;

        while(!queue.isEmpty())
        {
            int node=queue.remove();

            List<Edge> edges= graph.get(node);
            if(edges!=null)
            {
                for(Edge edge : edges)
                {
                   if(!visited[edge.to])
                   {
                       visited[edge.to]=true;
                       prev[edge.to]=node;
                       queue.offer(edge.to);
                   }

                }
            }
        }
    }

    private static void addUnweightedUndirectedEdge(List<List<Edge>> graph, int from, int to) 
    {
        addWeightedUndirectedEdge(graph,from ,to,1);
    }

    private static void addWeightedUndirectedEdge(List<List<Edge>> graph, int from, int to, int cost) 
    {
        addDirectedGraph(graph,from ,to ,cost);
        addDirectedGraph(graph,to ,from ,cost);
    }

    private static void addDirectedGraph(List<List<Edge>> graph, int from, int to, int cost) 
    {
        graph.get(from).add(new Edge(from, to, cost));
    }

    private static List<List<Edge>> createEmptyGraph(int n) 
    {
        List<List<Edge>> graph=new ArrayList<>(n);
        for(int i=0;i<n;i++)
        {
            graph.add(new ArrayList<>());
        }
        return graph;
    }
}
