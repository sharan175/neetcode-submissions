class Solution {
    public String predictPartyVictory(String s) {
        Queue<Integer> r=new LinkedList<>();
        Queue<Integer> d=new LinkedList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
              r.offer(i);
            }
            else{
                d.offer(i);
            }
        }
        int c=s.length();
        while(!r.isEmpty() && !d.isEmpty()){
            int a=r.poll();
            int b=d.poll();
            if(a<b){
              r.offer(c);
            }
            else{
              d.offer(c);
            }
            c++;
        }
        if(r.isEmpty()){
            return "Dire";
        }
        return "Radiant";
    }
}