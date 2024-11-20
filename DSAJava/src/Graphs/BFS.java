package Graphs;

import java.util.*;

public class BFS {
	int V;
	LinkedList<Integer> adjList[];

	public BFS(int v) {
		V = v;
		adjList = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			adjList[i] = new LinkedList();
		}
	}

	// Add an edge
	public void addEdge(int v, int w) {
		adjList[v].add(w);
	}

	// Perform BFS
	public void BFS(int start) {
		boolean[] visited = new boolean[V];
		Queue<Integer> queue = new LinkedList<>();
		visited[start] = true;
		queue.add(start);

		while (!queue.isEmpty()) {
			int node = queue.poll();
			System.out.print(node + " ");
			for (int neighbor : adjList[node]) {
				if (!visited[neighbor]) {
					visited[neighbor] = true;
					queue.add(neighbor);
				}
			}
		}
	}

	public static void main(String[] args) {
		BFS g = new BFS(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 3);

		g.BFS(0); // Output: 0 1 2 3
	}
}
