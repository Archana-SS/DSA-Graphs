//Space comp for undirected: O(2E). For directed garph: O(E) where E is number of edges
class Solution{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();

    List<List<Integer>> lst=new ArrayList<>(n);

    for(int i=0;i<n;i++){
      lst.add(new ArrayList<>());
    }

    for(int i=0;i<m;i++){
      int u=sc.nextInt();
      int v=sc.nextInt();

      lst.get(u).add(v);
      lst.get(v).add(u);
    }
  }
}
