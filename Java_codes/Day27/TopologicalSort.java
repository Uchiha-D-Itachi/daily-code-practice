import java.util.*;

public class TopologicalSort {

    int vertices;
    List<List<Integer>> adj;

    TopologicalSort(int v) {

        vertices = v;
        adj = new ArrayList<>();

        for (int i = 0; i < v; i++)
            adj.add(new ArrayList<>());
    }

    void addEdge(int src, int dest) {
        adj.get(src).add(dest);
    }

    void topoSort() {

        int[] indegree = new int[vertices];

        for (int i = 0; i < vertices; i++)
            for (int node : adj.get(i))
                indegree[node]++;

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < vertices; i++)
            if (indegree[i] == 0)
                queue.add(i);

        while (!queue.isEmpty()) {

            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : adj.get(node)) {

                indegree[neighbor]--;

                if (indegree[neighbor] == 0)
                    queue.add(neighbor);
            }
        }
    }

    public static void main(String[] args) {

        TopologicalSort g = new TopologicalSort(6);

        g.addEdge(5,2);
        g.addEdge(5,0);
        g.addEdge(4,0);
        g.addEdge(4,1);
        g.addEdge(2,3);
        g.addEdge(3,1);

        System.out.print("Topological Order: ");
        g.topoSort();
    }
}
