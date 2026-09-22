class Solution {
   
    public int[] findOrder(int num, int[][] pre) {
      List<Integer> k=new ArrayList<>();
      int v[]=new int[num];
      for(int i=0;i<pre.length;i++){
        v[pre[i][0]]=1;
      }
      int in[]=new int[num];
      List<List<Integer>> l=new ArrayList<>();
      for(int i=0;i<num;i++){
       l.add(new ArrayList<>());
      }
      for(int i=0;i<pre.length;i++){
        l.get(pre[i][1]).add(pre[i][0]);
        in[pre[i][0]]++;        
      }
      Queue<Integer> q=new LinkedList<>();
      for(int i=0;i<num;i++){
        if(v[i]==0){
            q.add(i);
        }
      }
      while(!q.isEmpty()){
        int a=q.poll();
        k.add(a);
        for(int i:l.get(a)){
            in[i]--;
            if(in[i]==0){
                q.add(i);
            }
        }
      }
       if(k.size()<num){
        return new int[0];
       }
      int m[]=new int[k.size()];
      for(int i=0;i<m.length;i++){
        m[i]=k.get(i);
      }
      return m;
    }
}
