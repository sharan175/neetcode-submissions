class Solution {
    public int longestConsecutive(int[] nums) {
    if(nums.length==0){
        return 0;
    }
    int count=1;
     HashSet<Integer> s=new HashSet<Integer>();
     for(int i=0;i<nums.length;i++){
        s.add(nums[i]);
     }
     for(int i:s){
        if(s.contains(i-1)){
            continue;
        }
       int c=i;
       int t=1;
       if(!s.contains(i-1)){
          while(s.contains(c+1)){
            t++;
            c++;
          }
       }
       count=Math.max(t,count);
     }
     return count;
    }
}
