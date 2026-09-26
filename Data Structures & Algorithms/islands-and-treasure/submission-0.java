class Solution {
 
    public void islandsAndTreasure(int[][] grid) {
        int nr=0;
        int nc=0;
      Queue<int[]>q=new LinkedList<>();
      for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]==0){
                int a[]=new int[2];
                a[0]=i;
                a[1]=j;
                q.offer(a);
            }
        }
      }
      int a[][]={
         {1,0},{-1,0},{0,1},{0,-1}
      };

       while(!q.isEmpty()){
        int k[]=q.poll();
        for(int[] m:a){
            nr=m[0]+k[0];
            nc=m[1]+k[1];
        
        if(nr<0 || nc<0 || nr>=grid.length || nc>=grid[0].length){
            continue;
        }
        if (grid[nr][nc] != Integer.MAX_VALUE) {
                    continue;
                }
          grid[nr][nc]=grid[k[0]][k[1]]+1;
          q.offer(new int[]{nr,nc});      
       }
       }
    }
}
