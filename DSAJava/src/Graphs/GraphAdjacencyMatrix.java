package Graphs;

public class GraphAdjacencyMatrix {
	int[][] graph;

	public GraphAdjacencyMatrix(int vertices) {
		graph = new int[vertices][vertices];
	}

	// Add an edge
	public void addEdge(int u, int v) {
		graph[u][v] = 1;
		graph[v][u] = 1; // For undirected graph
	}

	// Display the adjacency matrix
	public void display() {
		for (int i = 0; i < graph.length; i++) {
			for (int j = 0; j < graph[i].length; j++) {
				System.out.print(graph[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		GraphAdjacencyMatrix g = new GraphAdjacencyMatrix(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 3);

		g.display(); // Output: 0 1 1 0 ...
	}
}
