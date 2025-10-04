class Solution{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt(); //number of nodes/vertices
    int m=sc.nextInt(); //number of edges

    int mat[][]=new int[n][m];

    for(int i=0;i<m;i++){
      int u=sc.nextInt();
      int v=sc.nextInt();
      mat[u][v]=1;
      mat[v][u]=1; //no need for directed graph
    }
  }
}
