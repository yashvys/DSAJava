package Graphs;

import java.util.*;

public class DijkstraAlgorithm {
	static final int INF = Integer.MAX_VALUE;

	// Dijkstra's Algorithm for Shortest Path
	public static void dijkstra(int graph[][], int source) {
		int V = graph.length;
		int[] dist = new int[V];
		Arrays.fill(dist, INF);
		dist[source] = 0;

		boolean[] visited = new boolean[V];

		for (int count = 0; count < V - 1; count++) {
			int u = minDistance(dist, visited);
			visited[u] = true;

			for (int v = 0; v < V; v++) {
				if (!visited[v] && graph[u][v] != 0 && dist[u] != INF && dist[u] + graph[u][v] < dist[v]) {
					dist[v] = dist[u] + graph[u][v];
				}
			}
		}

		// Display the shortest distances
		System.out.println("Vertex   Distance from Source");
		for (int i = 0; i < V; i++) {
			System.out.println(i + " \t\t " + dist[i]);
		}
	}

	// Helper method to find the vertex with the minimum distance
	public static int minDistance(int[] dist, boolean[] visited) {
		int min = INF, minIndex = -1;
		for (int v = 0; v < dist.length; v++) {
			if (!visited[v] && dist[v] < min) {
				min = dist[v];
				minIndex = v;
			}
		}
		return minIndex;
	}

	public static void main(String[] args) {
		int graph[][] = { { 0, 10, 0, 0, 0, 0 }, { 10, 0, 5, 0, 0, 0 }, { 0, 5, 0, 15, 0, 0 }, { 0, 0, 15, 0, 10, 0 },
				{ 0, 0, 0, 10, 0, 5 }, { 0, 0, 0, 0, 5, 0 } };

		dijkstra(graph, 0); // Output the shortest distances from vertex 0
	}
}
