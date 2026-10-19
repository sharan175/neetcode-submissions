class Solution {
    public boolean isNStraightHand(int[] hand, int group) {
        TreeMap<Integer, Integer> m = new TreeMap<>();
        if (hand.length % group != 0) {
    return false;
}
        Arrays.sort(hand);
         for(int i=0;i<hand.length;i++){
            m.put(hand[i],m.getOrDefault(hand[i],0)+1);
         }
      while(!m.isEmpty()){
        int a=m.firstKey();
        for(int i=a;i<a+group;i++){
            if(!m.containsKey(i)){
                return false;
            }
            m.put(i,m.get(i)-1);
            if(m.get(i)==0){
                m.remove(i);
            }
        }
      }
      return true;
    }
}
