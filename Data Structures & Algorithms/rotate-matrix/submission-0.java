class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                int a=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=a;
            }
        }
        for(int i=0;i<matrix.length;i++){
            int s=0;
            int e=matrix[0].length-1;
            while(s<e){
             int a=matrix[i][s];
                matrix[i][s]=matrix[i][e];
                matrix[i][e]=a;
                s++;
                e--;
            }
        }
    }
}
