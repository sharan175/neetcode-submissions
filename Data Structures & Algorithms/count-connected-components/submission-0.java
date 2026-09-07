class Solution {
    public void dfs(int i,boolean v[],List<List<Integer>>l){
      v[i]=true;
      for(int  a:l.get(i)){
           if(!v[a]){
            dfs(a,v,l);
           }
      }
    }
    public int countComponents(int n, int[][] edges) {
    List<List<Integer>> l=new ArrayList<>();
    int count=0;
    for(int i=0;i<n;i++){
       l.add(new ArrayList<>());
    }
    for(int a[]:edges){
        l.get(a[0]).add(a[1]);
        l.get(a[1]).add(a[0]);
    }
    boolean v[]=new boolean[n];
    for(int i=0;i<n;i++){
        if(!v[i]){
            count++;
            dfs(i,v,l);
        }
    }
    return count;
    }
}
