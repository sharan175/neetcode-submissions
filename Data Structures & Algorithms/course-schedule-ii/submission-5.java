class Solution {
    public int[] findOrder(int num, int[][] pre) {
        ArrayList<ArrayList<Integer>> k=new ArrayList<>();
        for(int i=0;i<num;i++){
            k.add(new ArrayList<>());
        }
        for(int a[]:pre){
            k.get(a[1]).add(a[0]);
        }
        Queue<Integer> q=new LinkedList<>();
        int[] in=new int[num];
        for(int a[]:pre){
            in[a[0]]++;
        }
        for(int i=0;i<num;i++){
            if(in[i]==0){
                q.offer(i);
            }
        }
        int s[]=new int[num];
        int idx=0;
        while(!q.isEmpty()){
            int a=q.poll();
            s[idx++]=a;
            for(int x:k.get(a)){
                in[x]--;
                if(in[x]==0){
                    q.offer(x);
                }
            }
        }
        return idx==num? s:new int[0];
    }
}
