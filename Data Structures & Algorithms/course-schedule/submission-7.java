class Solution {
    public boolean dfs(int i,List<List<Integer>> l,boolean v[],boolean vis[]){
         v[i]=true;
         vis[i]=true;
        
         for(int a:l.get(i)){
           
            if(!v[a]){
                if(dfs(a,l,v,vis)){
                    return true;
                }
            }
             if(vis[a]){
            return true;
         }
         }
         vis[i]=false;
         return false;
    }
    public boolean canFinish(int num, int[][] pre) {        
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<num;i++){
            l.add(new ArrayList<>());
        }
        for(int a[]:pre){
            l.get(a[1]).add(a[0]);
        }
        boolean v[]=new boolean[num];
        boolean vis[]=new boolean[num];
        for(int i=0;i<num;i++){
            if(!vis[i]){
                if(dfs(i,l,v,vis)){
                    return false;
                }
            }
        }
        return true;
    }
}
