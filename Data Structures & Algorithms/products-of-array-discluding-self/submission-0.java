class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count=0;
        int mul=1;
        int a[]=new int[nums.length];
       for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
          count++;
        }
        else{
         mul=mul*nums[i];
        }
       }
       if(count>1){
        return a;
       } 
       if(count==1){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                a[i]=mul;
            }
        }
       }
       else{
       for(int i=0;i<nums.length;i++){
        a[i]=mul/(nums[i]);
       }
       }
       return a;
    }
}  
