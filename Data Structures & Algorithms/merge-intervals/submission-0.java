class Solution {
    public int[][] merge(int[][] inter) {
        Arrays.sort(inter,(a,b)->a[0]-b[0]);
        List<int[]> l=new ArrayList<>();
        for(int a[]:inter){
            if(l.isEmpty()|| l.get(l.size()-1)[1]<a[0]){
                l.add(a);
            }
            else{
                int[] last=l.get(l.size()-1);
                last[1]=Math.max(last[1],a[1]);
            }
        }
        return l.toArray(new int[l.size()-1][]);
    }
}
