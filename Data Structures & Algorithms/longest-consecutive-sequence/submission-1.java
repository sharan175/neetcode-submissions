class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        int count=1;
        for(int num:s){
            int c=1;
            if(!s.contains(num-1)){
              while(s.contains(num+1)){
                c++;
                num=num+1;
              }
            }
            count=Math.max(c,count);
        }
        return count;
    }
}
