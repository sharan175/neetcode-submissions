class Solution {
    public int islandPerimeter(int[][] grid) {
        boolean v[][]=new boolean[grid.length][grid[0].length];
        int val=0;
        int p=0;
          for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    p+=4;
                    if(i>0 && grid[i-1][j]==1){
                        p-=1;
                    }
                    if(i<grid.length-1 && grid[i+1][j]==1){
                        p-=1;
                    }
                    if(j>0 && grid[i][j-1]==1){
                        p-=1;
                    }
                    if(j<grid[0].length-1 && grid[i][j+1]==1){
                        p-=1;
                    }
                }
            }

          }
          return p;
    }
}