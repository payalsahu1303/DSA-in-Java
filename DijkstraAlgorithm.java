// Given a weighted, undirected and connected graph where you have given adjacency list adj. You have to find the shortest distance of all the vertices from the source vertex src, and return a list of integers denoting the shortest distance between each node and source vertex src.

import java.util.*;

public class DijkstraAlgorithm {

    static class Edge {
        int v;
        int weight;

        Edge(int v, int weight) {
            this.v = v;
            this.weight = weight;
        }
    }

    static void dijkstra(List<List<Edge>> graph, int src) {
        int nodes = graph.size();
        int[] dist = new int[nodes];
        boolean[] visited = new boolean[nodes];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        for (int i = 0; i < nodes; i++) {
            int u = findMin(dist, visited);
            if (u == -1)
                break;
            visited[u] = true;
            for (Edge edge : graph.get(u)) {
                int v = edge.v;
                int weight = edge.weight;
                if (!visited[v] && dist[v] > dist[u] + weight) {
                    dist[v] = dist[u] + weight;
                }
            }
        }
        for (int i = 0; i < nodes; i++) {
            System.out.println("To node " + i + " -> " + dist[i]);
        }
    }

    static int findMin(int[] dist, boolean[] visited) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < dist.length; i++) {
            if (!visited[i] && dist[i] < min) {
                min = dist[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int V = 5;
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(new Edge(1, 4));
        graph.get(0).add(new Edge(2, 1));
        graph.get(1).add(new Edge(3, 1));
        graph.get(1).add(new Edge(2, 2));
        graph.get(2).add(new Edge(1, 1));
        graph.get(2).add(new Edge(3, 7));
        graph.get(3).add(new Edge(4, 6));
        graph.get(4).add(new Edge(3, 1));
        int src = 0;
        dijkstra(graph, src);
    }
}

// The time complexity is O(V^2 + E) due to finding the minimum distance
// node. Space complexity is O(V + E) for storing edges and distances.