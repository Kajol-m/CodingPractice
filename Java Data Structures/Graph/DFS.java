package graph;
import java.util.*;

import graph.graphweight.Edge;
public class DFS {
	
	static class  Edge{
		int src;
		int dest;
		
		public Edge(int s,int d) {
			this.src=s;
			this.dest=d;
		}
	}
	
	public static void createGraph(ArrayList<Edge> graph1[]) {
		for(int i=0;i<graph1.length;i++) {
			graph1[i]=new ArrayList<Edge>();
		}
		graph1[0].add(new Edge(0,1));
		graph1[0].add(new Edge(0,2));
		
		graph1[1].add(new Edge(1,3));
		graph1[1].add(new Edge(1,0));
		
		graph1[2].add(new Edge(2,4));
		graph1[2].add(new Edge(2,0));
		
		graph1[3].add(new Edge(3,1));
		graph1[3].add(new Edge(3,4));
		graph1[3].add(new Edge(3,5));
		
		graph1[4].add(new Edge(4,2));
		graph1[4].add(new Edge(4,3));
		graph1[4].add(new Edge(4,5));
		
		graph1[5].add(new Edge(5,3));
		graph1[5].add(new Edge(5,4));
		graph1[5].add(new Edge(5,6));
		
		graph1[6].add(new Edge(6,5));
	}
	
	public static void dfs(ArrayList<Edge> graph1[],int curr,boolean vis[]) {
		System.out.print(curr+" ");
		vis[curr]=true;
		
		for(int i=0;i<graph1[curr].size();i++) {
			Edge e=graph1[curr].get(i);
			if(vis[e.dest]==false) {
			dfs(graph1,e.dest,vis);
		}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int V=7;
		
		ArrayList<Edge> graph1[]=new ArrayList[7];
		boolean vis[]=new boolean[V];
		createGraph(graph1);
		dfs(graph1,0,vis);

	}

}
