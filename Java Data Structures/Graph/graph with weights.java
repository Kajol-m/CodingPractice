package graph;
import java.util.*;
public class graphweight {
	
	static class  Edge{
		int src;
		int dest;
		int weight;
		
		public Edge(int s,int d,int w) {
			this.src=s;
			this.dest=d;
			this.weight=w;
		}
	}
	
	public static void createGraph(ArrayList<Edge> graph1[]) {
		for(int i=0;i<graph1.length;i++) {
			graph1[i]=new ArrayList<Edge>();
		}
		graph1[0].add(new Edge(0,2,2));
		graph1[1].add(new Edge(1,2,10));
		graph1[1].add(new Edge(1,3,0));
		graph1[2].add(new Edge(2,0,2));
		graph1[2].add(new Edge(2,1,10));
		graph1[2].add(new Edge(2,3,-1));
		graph1[3].add(new Edge(3,1,0));
		graph1[3].add(new Edge(3,2,-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int v=4;
		
		ArrayList<Edge> graph1[]=new ArrayList[v];
		createGraph(graph1);
		System.out.println("Neighbours of vertex 2 are:");
		for(int i=0;i<graph1[2].size();i++) {
			Edge e=graph1[2].get(i);
			System.out.print("("+e.dest+", "+e.weight+") ");
		}
		
		

	}

}
