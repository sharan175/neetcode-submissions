class Solution {
    int parent[];
    public int par(int x){
        if(parent[x]!=x){
            parent[x]=par(parent[x]);
        }
        return parent[x];
    }
    public int[] findRedundantConnection(int[][] e) {
     parent=new int[e.length+1];
     for(int i=1;i<=e.length;i++){
        parent[i]=i;
     }
     for(int i=0;i<e.length;i++){
        int a=e[i][0];
        int b=e[i][1];
        int p=par(a);
        int q=par(b);
        if(p==q){
            return new int[]{a,b};
        }
        parent[p]=q;
     }
     return new int[0];
    }
}
