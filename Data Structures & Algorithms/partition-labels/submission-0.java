class Solution {
    public List<Integer> partitionLabels(String s) {
        int a[]=new int[126];
        for(int i=0;i<s.length();i++){
            char b=s.charAt(i);
            a[b]=i;
        }
        int max=Integer.MIN_VALUE;
        int c=0;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            c++;
            max=Math.max(max,a[s.charAt(i)]);
            if(i==max){
                l.add(c);
                c=0;
            }
        }
        return l;
    }
}
