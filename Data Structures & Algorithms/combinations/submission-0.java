class Solution {
    public void comb(int a,int n,int k,List<List<Integer>> l,List<Integer> m){
        if(m.size()==k) l.add(new ArrayList<>(m));
        for(int i=a;i<=n;i++){
            m.add(i);
            comb(i+1,n,k,l,m);
            m.remove(m.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
       List<List<Integer>> l=new ArrayList<>();
       List<Integer>m=new ArrayList<>();
       comb(1,n,k,l,m);
       return l;
    }
}