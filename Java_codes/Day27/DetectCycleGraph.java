import java.util.*;

public class DetectCycleGraph {

    int vertices;
    LinkedList<Integer>[] adj;

    DetectCycleGraph(int v) {
        vertices = v;
        adj = new LinkedList[v];

        for (int i = 0; i < v; i++)
            adj[i] = new LinkedList<>();
    }

    void addEdge(int src, int dest) {
        adj[src].add(dest);
        adj[dest].add(src);
    }

    boolean dfs(int node, boolean[] visited, int parent) {

        visited[node] = true;

        for (int neighbor : adj[node]) {

            if (!visited[neighbor]) {
                if (dfs(neighbor, visited, node))
                    return true;
            }
            else if (neighbor != parent)
                return true;
        }

        return false;
    }

    boolean hasCycle() {

        boolean[] visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                if (dfs(i, visited, -1))
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        DetectCycleGraph g = new DetectCycleGraph(4);

        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,0); // cycle

        System.out.println("Cycle detected: " + g.hasCycle());
    }
}
