class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    int i=0;
    int j=matrix.length-1;
    while(i<=j){
       int m=(i+j)/2;
        if(matrix[m][0]<=target && matrix[m][matrix[0].length-1]>=target){
            int low=0;
            int high=matrix[0].length-1;
          while(low<=high){

 int mid=(high+low)/2;

 if(matrix[m][mid]==target){

 return true;

}

if(target<matrix[m][mid]){

 high=mid-1;

 }

else{

 low=mid+1;

}

}
return false;
        }
        else if(matrix[m][0]>target){
             j=m-1;
        }
        else{
            i=m+1;
        }
    }

    
        
    
     return false; 
    }
}
