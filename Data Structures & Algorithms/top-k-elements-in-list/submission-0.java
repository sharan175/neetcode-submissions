class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer>[] b=new ArrayList[nums.length+1];
        for(int freq:map.keySet()){
            int s=map.get(freq);
            if(b[s]==null){
                b[s]=new ArrayList<>();
            }
            b[s].add(freq);
        }
        int a[]=new int[k];
        int index=0;
        for(int i=b.length-1;k>index && i>=0;i--){
            if(b[i]!=null){
            for(int num:b[i]){
            a[index++]=num;
            if(index==k){
                break;
            }
            }
            }
        }
        return a;
    }
}
