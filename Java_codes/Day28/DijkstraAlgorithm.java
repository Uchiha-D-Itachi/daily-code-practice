import java.util.*;

class Node implements Comparable<Node> {

    int vertex;
    int distance;

    Node(int v, int d) {
        vertex = v;
        distance = d;
    }

    public int compareTo(Node other) {
        return this.distance - other.distance;
    }
}

public class DijkstraAlgorithm {

    int vertices;
    List<List<Node>> adj;

    DijkstraAlgorithm(int v) {

        vertices = v;
        adj = new ArrayList<>();

        for (int i = 0; i < v; i++)
            adj.add(new ArrayList<>());
    }

    void addEdge(int src, int dest, int weight) {
        adj.get(src).add(new Node(dest, weight));
    }

    void dijkstra(int source) {

        int[] dist = new int[vertices];
        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<Node> pq = new PriorityQueue<>();

        dist[source] = 0;
        pq.add(new Node(source, 0));

        while (!pq.isEmpty()) {

            Node current = pq.poll();
            int u = current.vertex;

            for (Node neighbor : adj.get(u)) {

                int v = neighbor.vertex;
                int weight = neighbor.distance;

                if (dist[u] + weight < dist[v]) {

                    dist[v] = dist[u] + weight;
                    pq.add(new Node(v, dist[v]));
                }
            }
        }

        System.out.println("Shortest distances from source:");

        for (int i = 0; i < vertices; i++)
            System.out.println("Node " + i + " -> " + dist[i]);
    }

    public static void main(String[] args) {

        DijkstraAlgorithm g = new DijkstraAlgorithm(5);

        g.addEdge(0,1,10);
        g.addEdge(0,4,5);
        g.addEdge(1,2,1);
        g.addEdge(4,1,3);
        g.addEdge(4,2,9);
        g.addEdge(2,3,4);
        g.addEdge(3,0,7);

        g.dijkstra(0);
    }
}
