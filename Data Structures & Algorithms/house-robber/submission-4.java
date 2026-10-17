class Solution {
   
    public int rob(int[] nums) {
        int d[]=new int [nums.length+2];   
    
    for(int i=nums.length-1;i>=0;i--){
        d[i]=Math.max(nums[i]+d[i+2],d[i+1]);
    }
    return d[0];
    }
}
