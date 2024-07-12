package GraphTheoryFreeCodeCamp;
import java.util.*;
public class DfsAdjList 
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
    
    public static void main(String[] args) 
    {
        int numNodes=4;
        
        Map<Integer , List<Edge>> graph =new HashMap<>();

        addDirectedEdge(graph,0,1,4);
        addDirectedEdge(graph,0,2,5);
        addDirectedEdge(graph,1,3,6);
        addDirectedEdge(graph,1,2,-2);
        addDirectedEdge(graph,2,3,1);
        addDirectedEdge(graph,2,2,10);

        int nodecount=dfs(graph, 0 , numNodes);
        if(nodecount!=4) System.err.println("Error with dfs");

        nodecount=dfs(graph, 4 , numNodes);
        if(nodecount!=1) System.err.println("Error with dfs");
        
    }

    private static int dfs(Map<Integer, List<Edge>> graph, int start, int n) 
    {
        int count=0;
        boolean visted[]=new boolean[n+1];

        Stack<Integer> stack =new Stack<>();
        stack.push(start);
        visted[start]=true;

        while(!stack.isEmpty())
        {
            int node =stack.pop();
            count++;

            List<Edge> edges=graph.get(node);

            if(edges!=null)
            {
                for(Edge edge: edges)
                {
                    if(visted[edge.to])
                    {
                        stack.push(edge.to);
                        visted[edge.to]=true;
                    }
                }
            }
        }
        return count;
    }

    private static void addDirectedEdge(Map<Integer, List<Edge>> graph, int from, int to, int cost) 
    {
        List<Edge> edge = graph.get(from);

        if(edge == null)
        {
            edge=new ArrayList<>();
            graph.put(from, edge);
        }

        edge.add(new Edge(from, to, cost));
    }
}
