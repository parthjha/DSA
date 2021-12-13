package com.example;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class DemoTest {
//

	public static void main(String[] args) {
		GraphExample g = new GraphExample(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		
		g.implementBFS(2);
		System.out.println();
		g.implementDFS(0);

	}

}

class GraphExample {
	private int vertices;
	private LinkedList<Integer>[] adj;

	private GraphExample() {

	}

	public void addEdge(int e,int v) {
		adj[e].add(v);
	}

	public GraphExample(int vertices) {
		super();
		this.vertices = vertices;
		this.adj = new LinkedList[vertices];
		for (int iter = 0; iter < vertices; iter++) {
			adj[iter] = new LinkedList<>();
		}
	}

	public void implementBFS(int s) {
		LinkedList<Integer> list = new LinkedList<>();
		boolean[] visited = new boolean[vertices];
		list.add(s);
		while (!list.isEmpty()) {
			int val = list.poll();
			System.out.print(val + "-->");
			Iterator<Integer> iterator = adj[val].listIterator();
			while (iterator.hasNext()) {
				int n = iterator.next();
				if (!visited[n]) {
					visited[n] = true;
					list.add(n);
				}
			}
		}
	}

	public void implementDFS(int s) {
		boolean[] visited = new boolean[vertices];
		DFSUtil(s, visited);
	}

	private void DFSUtil(int s, boolean[] visited) {

		visited[s] = true;
		Iterator<Integer> iter = adj[s].iterator();
		while (iter.hasNext()) {
			int val = iter.next();
			System.out.print(val + "-->");
			if (!visited[val]) {
				DFSUtil(val, visited);
			}
		}

	}

}
