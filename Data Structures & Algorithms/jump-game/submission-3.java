class Solution {
    public boolean canJump(int[] nums) {
        int maxjump=0;
     for(int i=0;i<nums.length-1;i++){
        maxjump=Math.max(maxjump,i+nums[i]);
        if(nums[i]==0 && maxjump==i){
            return false;
        }
     }
     return true;     
    }
}
