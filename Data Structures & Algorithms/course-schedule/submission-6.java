class Solution {
    public boolean dfs(int i,List<List<Integer>> l,int v[]){
        if(v[i]==1){
            return false;
        }
        if(v[i]==2){
            return true;
        }
         v[i]=1;
        for(int j=0;j<l.get(i).size();j++){
            if(!dfs(l.get(i).get(j),l,v)){
                return false;
            }
        }
         
        v[i]=2;
        return true; 
    }
    public boolean canFinish(int numCourses, int[][] pre) {
        List<List<Integer>> l=new ArrayList<>();
        boolean b=true;
        for(int i=0;i<numCourses;i++){
            l.add(new ArrayList<>());
        }
        for(int a[]:pre){
            l.get(a[1]).add(a[0]);
        }
        int v[]=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            b&=dfs(i,l,v);
        }
        return b;
    }
}
