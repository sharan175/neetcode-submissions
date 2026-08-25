class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int total=nums[0];
        for(int i=1;i<nums.length;i++){
            if(sum+nums[i]<nums[i]){
                sum=nums[i];
            }
            else{
                sum+=nums[i];
            }
            total=Math.max(total,sum);
        }
        return total;
    }
}
