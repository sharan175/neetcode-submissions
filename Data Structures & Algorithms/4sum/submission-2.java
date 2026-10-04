class Solution {
    public List<List<Integer>> fourSum(int[] n, int target) {
        Set<List<Integer>> z=new HashSet<>();
         for(int i=0;i<n.length;i++){
            for(int j=i+1;j<n.length;j++){
                HashMap<Long,Integer> m=new HashMap<>();
                for(int k=j+1;k<n.length;k++){
                    long need=(long)target-n[i]-n[j]-n[k];
                   if(m.containsKey(need)){
                    List<Integer> l=new ArrayList<>();
                    l.add(n[i]);
                    l.add(n[j]);
                    l.add(n[k]);
                    l.add(n[m.get(need)]);
                    Collections.sort(l);
                    z.add(l);
                   }
                   m.put((long)n[k],k);
                }
            }
         }
        return new ArrayList<>(z);
    }
}