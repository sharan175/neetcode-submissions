class Solution {
    int heights[][];
    int a;
    int b;
    int bc[]={-1,1,0,0};
    int bs[]={0,0,-1,1};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        this.heights=heights;
        List<List<Integer>>l=new ArrayList<>();
        a=heights.length;
        b=heights[0].length;
        boolean pacific[][]=new boolean[a][b];
        boolean atlantic[][]=new boolean[a][b];
        for(int i=0;i<a;i++){
            dfs(i,0,pacific);
        }
        for(int j=0;j<b;j++){
            dfs(0,j,pacific);        
        }
         for(int i=0;i<a;i++){
            dfs(i,b-1,atlantic);
        }
        for(int j=0;j<b;j++){
            dfs(a-1,j,atlantic);        
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
               if(pacific[i][j] && atlantic[i][j]){
                 l.add(Arrays.asList(i,j));
               }
            }
            
        }
        return l;
    }
    public void dfs(int x,int y,boolean ocean[][]){
          if(ocean[x][y]){
            return;
          }
          ocean[x][y]=true;
          for(int i=0;i<4;i++){
            int r=x+bc[i];
            int s=y+bs[i];
            if(r<0 || s<0 || r>=a ||s>=b) continue;
            if(heights[r][s]>=heights[x][y]){
                dfs(r,s,ocean);
            }
          }
    }
}
