class Solution {
    public boolean isValidSudoku(char[][] board) {
     HashSet<Character>[] c=new HashSet[9];
     HashSet<Character>[] r=new HashSet[9];
     HashSet<Character>[] q=new HashSet[9];
     for(int i=0;i<9;i++){
        c[i]=new HashSet<>();
        r[i]=new HashSet<>();
        q[i]=new HashSet<>();
     }
     for(int i=0;i<board.length;i++){
        for(int j=0;j<board[0].length;j++){
            char a=board[i][j];
             if(Character.isDigit(board[i][j])){
                int k=(i/3) * 3 + j/3;
                if(c[j].contains(a) || r[i].contains(a) ||
                q[k].contains(a)){
                    return false;
                }
                q[k].add(a);
                c[j].add(a);
                r[i].add(a);
             }
        }
     }
       return true;
    }
}
