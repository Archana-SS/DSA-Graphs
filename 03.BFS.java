class Solution{
  public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj){
    List<Integer> ans=new ArrayList<>();
    int n=adj.size();

    boolean vis[]=new boolean[n];
    Queue<Integer> q=new LinkedList<>();

    vis[0]=true;
    q.add(0);

    while(!q.isEmpty()){
      int u=q.poll();
      ans.add(u);

      for(int v:adj.get(u)){
        if(!vis[v]){
          vis[v]=true;
          q.add(v);
        }
      }
    }

    return ans;
  }
}
