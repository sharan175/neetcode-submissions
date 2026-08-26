class Solution {
    public void dfs(int i,int j,char[][] board){
         if(i<0 ||i>=board.length || j<0 || j>=board[0].length){
            return;
         }
         if(board[i][j]!='O') return;
         
         board[i][j]='l';
         dfs(i+1,j,board);
         dfs(i-1,j,board);
         dfs(i,j+1,board);
         dfs(i,j-1,board);
    }
    public void solve(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(i==0 || j==0 || i==board.length-1 ||
                j==board[0].length-1 ){
                    if(board[i][j]=='O'){
                        dfs(i,j,board);
                    }
                }
            }
        }
         for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='l'){
                    board[i][j]='O';
                }
                else{
                    board[i][j]='X';
                }
            }
        }
    }
}
