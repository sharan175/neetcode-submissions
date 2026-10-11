class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        backtrack(0,nums,a,l);
        return l;
    }
    public void backtrack(int k,int[] n,List<Integer> a,List<List<Integer>> l){
        l.add(new ArrayList<>(a));
        for(int i=k;i<n.length;i++){
            a.add(n[i]);
            backtrack(i+1,n,a,l);
            a.remove(a.size()-1);
        }
    }
}
