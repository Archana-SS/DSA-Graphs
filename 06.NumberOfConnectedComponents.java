//Given a undirected Graph consisting of V vertices numbered from 0 to V-1 and E edges. The ith edge is represented by [ai,bi], denoting a edge between vertex ai and bi. We say two vertices u and v belong to a same component if there is a path from u to v or v to u. Find the number of connected components in the graph.
//A connected component is a subgraph of a graph in which there exists a path between any two vertices, and no vertex of the subgraph shares an edge with a vertex outside of the subgraph.
//Same solution works for Number of provinces question
class Solution{
  private void bfs(int node,List<List<Integer>> adj,boolean vis[]){
    vis[node]=true;

    Queue<Integer> q=new LinkedList<>();

    q.add(node);

    while(!q.isEmpty()){
      int u=q.poll();

      for(int v:adj.get(u)){
        if(!vis[v]){
          vis[v]=true;
          q.add(v);
        }
      }
    }
  }
  public int connectedComponents(List<List<Integer>> edges){
    int n=edges.size();

    List<List<Integer>> adj=new ArrayList<>();

    for(int i=0;i<n;i++){
      adj.add(new ArrayList<>());
    }

    for(List<Integer> edge:edges){
      int u=edge.get(0);
      int v=edge.get(1);

      adj.get(u).add(v);
      adj.get(v).add(u);
    }

    boolean vis[]=new boolean[n];

    int count=0;

    for(int i=0;i<n;i++){
      if(!vis[i]){
        count++;
        bfs(i,adj,vis);
      }
    }

    return count;
  }
}
