class Solution{
  public void dfsUtil(int start,ArrayList<ArrayList<Integer>> adj,boolean vis[],ArrayList<Integer> ans){
    vis[start]=true;
    ans.add(start);

    for(int u:adj.get(start)){
      if(!vis[u])
        dfsUtil(u,adj,vis,ans);
    }
  }
  public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj){
    ArrayList<Integer> ans=new ArrayList<>();
    int n=adj.size();

    boolean vis[]=new boolean[n];
    vis[0]=true;

    dfsUtil(0,adj,vis,ans);

    return ans;
  }
}
