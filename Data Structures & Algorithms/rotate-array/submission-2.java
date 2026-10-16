class Solution {
    public void rotate(int[] nums,int i,int j){
       while(i<j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        i++;
        j--;
       }
    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        if(k<0) k+=nums.length;
       rotate(nums,0,nums.length-1);
       rotate(nums,k,nums.length-1);
       rotate(nums,0,k-1); 
    }
}