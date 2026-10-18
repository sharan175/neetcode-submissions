class Solution {
    public int maxProduct(int[] nums) {
       int max=nums[0];
       int prev=nums[0];
       int pr=nums[0];
       for(int i=1;i<nums.length;i++){
        int a=prev;
        int b=pr;
        prev=Math.min(nums[i],Math.min(nums[i]*a,nums[i]*b));
        pr=Math.max(nums[i],Math.max(nums[i]*a,nums[i]*b));
        max=Math.max(pr,max);
       }
       return max;
    }
}
