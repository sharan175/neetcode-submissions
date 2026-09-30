class Solution {
    public int subarraySum(int[] n, int k) {
        int sum=0;
        int count=0;
        HashMap<Integer,Integer> m=new HashMap<>();
        m.put(0,1);
        for(int i=0;i<n.length;i++){
            sum+=n[i];
            if(m.containsKey(sum-k)){
               count+=m.get(sum-k);
            }
            m.put(sum,m.getOrDefault(sum,0)+1);
        }
        return count;
    }
}