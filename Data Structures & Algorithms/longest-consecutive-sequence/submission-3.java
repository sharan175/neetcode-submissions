class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(nums[i]-1)){
                m.put(nums[i],m.get(nums[i]-1)+1);
            }
            else{
                m.put(nums[i],1);
            }
            count=Math.max(m.get(nums[i]),count);
        }
        return count;
    }
}
