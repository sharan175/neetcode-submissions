class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len=999;
        int i=0;
        int sum=0;
        for(int j=0;j<nums.length;j++){
             sum+=nums[j];
             if(sum>=target){
                  while(sum>=target && i<=j){
                    len=Math.min(len,j-i+1);
                    sum-=nums[i];
                    i++;
                  }
                }
             }
             return len==999 ? 0:len;
        }
        
    }
