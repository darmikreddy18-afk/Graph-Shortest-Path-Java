import java.util.*;
class graph_shortest_path_project{


    static class Edge{
        int src;
        int dest;
        int wt;
    
    Edge(int src,int dest,int wt){
        this.src=src;
        this.dest=dest;
        this.wt=wt;
    }
}
    public static void graph_insert(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1, 4));
        graph[0].add(new Edge(0, 2, 2));

        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 5));

        graph[2].add(new Edge(2, 3, 8));
        graph[2].add(new Edge(2, 4, 10));

        graph[3].add(new Edge(3, 4, 2));

        

    }
    public static  class Pair implements Comparable<Pair>{
        int node;
        int dist;
        Pair(int node,int dist){
            this.node=node;
            this.dist=dist;

        }
        @Override
        public int compareTo(Pair p2){
            return this.dist-p2.dist;

        }
    }
    public static void Dijktras(ArrayList<Edge> graph[],boolean visit[],int src,int V){
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        int dist[]=new int[V];
        for(int i=0;i<V;i++){
            if(i!=src){
            dist[i]=Integer.MAX_VALUE;
            }

        }


        pq.add(new Pair(src,0));
        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            if(!visit[curr.node]){
                visit[curr.node]=true;
                for(int i=0;i<graph[curr.node].size();i++){
                    Edge e=graph[curr.node].get(i);
                    int u=e.src;
                    int v =e.dest;
                    if(dist[u]+e.wt<dist[v]){
                        dist[v]=dist[u]+e.wt;
                        pq.add(new Pair(v,dist[v]));
                    }

                }
            }
        }
        for(int i=0;i<V;i++){
            System.out.println("the distance of vertex "+i+" from the source "+0+" is "+dist[i]);
        }


    }

    

    public static void main(String[] args) {
        ArrayList<Edge> graph[]=new ArrayList[5];
        graph_insert(graph);

        boolean visit[]=new boolean[5];
        Dijktras(graph, visit, 0, 5);




    }

}



