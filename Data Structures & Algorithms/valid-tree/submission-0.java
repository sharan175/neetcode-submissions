class Solution {
    public boolean dfs(int node,int parent,List<List<Integer>> l,boolean v[]){
        v[node]=true;
        for(int nex:l.get(node)){
            if(nex==parent) continue;
            if(v[nex]) return false;
            if(!dfs(nex,node,l,v)){
                return false;
            }
        }
     return true;
    }
    public boolean validTree(int n, int[][] edges) {
       List<List<Integer>> l=new ArrayList<>();
       
       for(int i=0;i<n;i++){
        l.add(new ArrayList<>());
       }
       for(int i=0;i<edges.length;i++){
          int a=edges[i][0];
          int b=edges[i][1];
          l.get(a).add(b);
          l.get(b).add(a);
       }
       boolean v[]=new boolean[n];
       if(!dfs(0,-1,l,v)){
        return false;
       }
       for(int i=0;i<n;i++){
        if(!v[i]){
            return false;
        }
       }
       return true;
    }
}
