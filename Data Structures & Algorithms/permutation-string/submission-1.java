class Solution {
     int a[]=new int[126];
     int b[]=new int[126];
    public boolean checkInclusion(String s1, String s2) {
      if(s2.length()<s1.length()) return false;
       for(int i=0;i<s1.length();i++){
        a[s1.charAt(i)]++;
       }     
       for(int i=0;i<s1.length();i++){
        b[s2.charAt(i)]++;
       }
       if(matches(s1,s2)){
        return true;
       }
       for(int i=s1.length();i<s2.length();i++){
         b[s2.charAt(i)]++;
         b[s2.charAt(i-s1.length())]--;
         if(matches(s1,s2)){
          return true;
         }
       }
       return false;
    }
    public boolean matches(String s1,String s2){
       for(int i=0;i<126;i++){
          if(a[i]!=b[i]){
            return false;
          }
       }
       return true;
    }
}
