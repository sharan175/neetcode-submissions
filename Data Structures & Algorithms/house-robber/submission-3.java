class Solution {
    public int dfs(int nums[],int i,int d[]){
        if(i>=nums.length){
            return 0;
        }
        if(d[i]!=-1){
            return d[i];
        }
        return d[i]= Math.max(nums[i]+dfs(nums,i+2,d),dfs(nums,i+1,d));
    }
    public int rob(int[] nums) {
        int d[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            d[i]=-1;
        }
       return dfs(nums,0,d);    
    }
}
