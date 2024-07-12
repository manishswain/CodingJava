package GraphTheoryFreeCodeCamp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DfsAdjListRecursiveCountNodes 
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
        int numNodes=5;
        Map<Integer,List<Edge>> graph=new HashMap<>();

        addDirectedEdge(graph,0,1,4);
        addDirectedEdge(graph,0,2,5);
        addDirectedEdge(graph,1,3,6);
        addDirectedEdge(graph,1,2,-2);
        addDirectedEdge(graph,2,3,1);
        addDirectedEdge(graph,2,2,10);

        int noNodes=dfs(0,new boolean[numNodes],graph);

        System.out.println("Dfs starting from 0 contains "+noNodes);
        
    }


    private static int dfs(int at, boolean[] visited, Map<Integer, List<Edge>> graph) 
    {
        if(visited[at])
        {
            return 0;
        }

        int count =1 ;       
        visited[at]=true;

        List<Edge> edges = graph.get(at);
        if(edges !=null)
        {
            for (Edge edge: edges) 
            {
                count+=dfs(edge.to, visited, graph);
            }
        }
        return count;
    }

    private static void addDirectedEdge(Map<Integer, List<Edge>> graph, int from, int to, int cost) 
    {
        List<Edge> edge=graph.get(from);

        if(edge==null)
        {
            edge = new ArrayList<>();
            graph.put(from, edge);
        }

        edge.add(new Edge(from, to, cost));
    }
}
