class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int sum=0;
            HashMap<Integer,Integer> h=new HashMap<>();
            for(int j=i+1;j<nums.length;j++){
                sum=nums[i]+nums[j];
                if(h.containsKey(-nums[j])){
                  List<Integer> l=new ArrayList<>();
                  l.add(nums[j]);
                  l.add(nums[i]);
                  l.add(h.get(-nums[j]));
                  Collections.sort(l);
                  s.add(l);
                }
                h.put(nums[i]+nums[j],nums[j]);
            }
        }
        return new ArrayList<>(s);
    }
}
