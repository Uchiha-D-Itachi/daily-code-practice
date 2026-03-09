import java.util.*;

class Edge {
    int destination;
    int weight;

    Edge(int dest, int weight) {
        this.destination = dest;
        this.weight = weight;
    }
}

public class WeightedGraph {

    int vertices;
    List<List<Edge>> adjList;

    WeightedGraph(int v) {

        vertices = v;
        adjList = new ArrayList<>();

        for (int i = 0; i < v; i++)
            adjList.add(new ArrayList<>());
    }

    void addEdge(int src, int dest, int weight) {
        adjList.get(src).add(new Edge(dest, weight));
        adjList.get(dest).add(new Edge(src, weight));
    }

    public static void main(String[] args) {

        WeightedGraph g = new WeightedGraph(4);

        g.addEdge(0,1,4);
        g.addEdge(0,2,1);
        g.addEdge(2,1,2);
        g.addEdge(1,3,1);
        g.addEdge(2,3,5);

        System.out.println("Weighted graph created");
    }
}
