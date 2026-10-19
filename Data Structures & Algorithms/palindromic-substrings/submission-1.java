class Solution {
    public int tra(int i,int j,String s){
      int count=0;
      while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j) ){
        count++;
        i--;
        j++;
      }
      return count;
    }
    public int countSubstrings(String s) {
        int count=0;
         for(int i=0;i<s.length();i++){
            count+=tra(i,i,s);
            count+=tra(i,i+1,s);
         }
         return count;
    }
}
