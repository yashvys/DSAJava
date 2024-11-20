package Graphs;

import java.util.*;

public class DFS {
	int V;
	LinkedList<Integer> adjList[];

	public DFS(int v) {
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

	// Perform DFS
	public void DFS(int v) {
		boolean[] visited = new boolean[V];
		Stack<Integer> stack = new Stack<>();
		stack.push(v);

		while (!stack.isEmpty()) {
			int node = stack.pop();
			if (!visited[node]) {
				System.out.print(node + " ");
				visited[node] = true;
			}
			for (int neighbor : adjList[node]) {
				if (!visited[neighbor])
					stack.push(neighbor);
			}
		}
	}

	public static void main(String[] args) {
		DFS g = new DFS(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 3);

		g.DFS(0); // Output: 0 1 2 3
	}
}
