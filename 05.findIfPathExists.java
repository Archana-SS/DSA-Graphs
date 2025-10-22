// You are given an undirected graph consisting of ‘N’ nodes from 0 to ‘N’ - 1. You are given a list ‘EDGES’ of size ‘M’, consisting of all the edges of this undirected graph, and two nodes ‘SOURCE’ and ‘DESTINATION’ of this graph. Determine whether there exists a path from node ‘SOURCE’ to node ‘DESTINATION’. In other words, check whether there exists a path from node ‘SOURCE’ to node ‘DESTINATION’ by moving along the edges of the graph.

class Solution{
  public boolean isPath(List<List<Integer>> adj,int src,int dest,boolean vis[]){
    if(src==dest)
      return true;

    vis[src]=true;

    for(int u:adj.get(src)){
      if(!vi[u]){
        if(isPath(adj,u,dest,vis)
           return true;
      }
    }

    return false;
  }
  
  public boolean isPath(int edges[][],int source,int destination){
    int n=edge.length;

    List<List<Integer>> adj=new ArrayList<>();

    for(int i=0;i<n;i++){
      adj.add(new ArrayList<>());
    }

    for(int edge[]:edges){
      int u=edge[0];
      int v=edge[1];

      adj.get(u).add(v);
      adj.get(v).add(u);
    }

    boolean vis[]=new boolean[n];

    return isPath(adj,source,destination,vis);
  }
}
