class Solution {
    public int[] dailyTemperatures(int[] t) {
       int a[]=new int[t.length];
       int k=0;
       Stack<Integer> s=new Stack<>();
       Stack<Integer> m=new Stack<>();
       for(int i=0;i<t.length;i++){
        while(!s.isEmpty() && s.peek()<t[i]){
           k=m.pop();
           a[k]=i-k;
           s.pop();
        }
        s.push(t[i]);
        m.push(i);
       }
       return a;
    }
}
