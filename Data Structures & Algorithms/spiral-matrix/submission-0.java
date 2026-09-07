class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       List<Integer> l=new ArrayList<>();
       int up=0;
       int down=matrix.length-1;
       int left=0;
       int right=matrix[0].length-1;
      while(left<=right && up<=down){
           int count=left;
           while(count<=right){
            l.add(matrix[up][count]);
           count++;
           }
           up++;
           count=up;
           while(count<=down){
           l.add(matrix[count][right]);
           count++;
           }
           right--;
           count=right;
           if(down>=up){
           while(count>=left){
            l.add(matrix[down][count]);
            count--;
           }
            down--;
           }
           count=down;
           if(right>=left){
           while(count>=up){
            l.add(matrix[count][left]);
            count--;
           }
           left++;
           }
      }
      return l;
    }
}
