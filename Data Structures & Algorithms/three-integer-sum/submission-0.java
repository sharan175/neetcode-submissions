class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> h=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int j=i+1;j<nums.length;j++){
                int sum=nums[i]+nums[j];
                if(map.containsKey(nums[j])){
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(map.get(nums[j]));
                    Collections.sort(list);
                    h.add(list);
                }
                map.put(0-sum,nums[j]);                
            }
        }
        List<List<Integer>> j=new ArrayList<>();
        for(List<Integer> l:h){
          j.add(l);
        }
        return j;
    }
}
