package GraphTheoryFreeCodeCamp;
import java.util.*;
public class BfsAdjListCalcDepth 
{
    public static int DEPTH =-1;
    public static void main(String[] args) 
    {
        int numNodes = 13;
        List<List<Integer>> graph =new ArrayList<>();
        for(int i=0;i<numNodes;i++) graph.add(new ArrayList<>());

        addUndirectedEdge(graph, 0, 1);
        addUndirectedEdge(graph,0,1);
        addUndirectedEdge(graph,0,7);
        addUndirectedEdge(graph,1,2);
        addUndirectedEdge(graph,1,7);
        addUndirectedEdge(graph,2,3);
        addUndirectedEdge(graph,2,5);
        addUndirectedEdge(graph,2,8);
        addUndirectedEdge(graph,3,4);
        addUndirectedEdge(graph,3,5);
        addUndirectedEdge(graph,4,5);
        addUndirectedEdge(graph,5,6);
        addUndirectedEdge(graph,6,7);
        addUndirectedEdge(graph,6,8);
        addUndirectedEdge(graph,7,8);

        System.out.println("Depth of the node : "+ bfs(graph,3,numNodes));
            
         
    }

    private static int  bfs(List<List<Integer>> graph, int start, int numNodes) 
    {
        boolean visited[]=new boolean[numNodes];
        Deque<Integer> queue =new ArrayDeque<>();
        queue.offer(start);
        queue.offer(DEPTH);
        return bfs(graph,visited,queue);
    }

    private static int bfs(List<List<Integer>> graph, boolean[] visited, Deque<Integer> queue) 
    {
        int at=queue.poll();

        if(at == DEPTH)
        {
            queue.offer(DEPTH);
            return 1;
        }

        if(visited[at])
        {
            return 0;
        }

        visited[at]=true;

        List<Integer> neighbours = graph.get(at);
        if(neighbours!=null)
        {
            for (Integer neighbour : neighbours) 
            {
                if(!visited[neighbour])
                queue.offer(neighbour);    
            }
        }

        int depth=0;

        while (true)
        {
            if(queue.size()==1 && queue.peek()==DEPTH) break;

            depth+=bfs(graph, visited, queue);
        }
        return depth;
    }

    private static void addUndirectedEdge(List<List<Integer>> graph, int from, int to) 
    {
        graph.get(from).add(to);
        graph.get(to).add(from);
    }
}
