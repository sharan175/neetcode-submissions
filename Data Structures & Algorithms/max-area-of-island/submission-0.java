class Solution {
    public int dfs(int[][] grid,int row,int col){
        if(row<0 || row>=grid.length || col<0 ||                    col>=grid[0].length){
            return 0;
        }
       if(grid[row][col]==0){
        return 0;
       }
       grid[row][col]=0;
       int a=dfs(grid,row+1,col);
       int b=dfs(grid,row-1,col);
       int c=dfs(grid,row,col-1);
       int d=dfs(grid,row,col+1);
       return a+b+c+d+1; 
    }
    public int maxAreaOfIsland(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                  count=Math.max(count,dfs(grid,i,j));
                }
            }
        }
        return count;
    }
}
