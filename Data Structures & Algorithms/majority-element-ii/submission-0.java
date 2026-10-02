class Solution {
    public List<Integer> majorityElement(int[] nums) {
       HashSet<Integer> h=new HashSet<>();
       HashMap<Integer,Integer> l=new HashMap<>();
       for(int i=0;i<nums.length;i++){
         l.put(nums[i],l.getOrDefault(nums[i],0)+1);
          if(l.get(nums[i])>(nums.length)/3){
            h.add(nums[i]);
        }
       }
       List<Integer> a=new ArrayList<>();
       for(int z:h){
        a.add(z);
       }
       return a;
    }
}