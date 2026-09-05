class Solution {
    public int lengthOfLongestSubstring(String s) {
        int j=0;
        int max=0;
        int a[]=new int[128];
        for(int i=0;i<s.length();i++){
           a[s.charAt(i)]++;
          while(a[s.charAt(i)]>1){
           a[s.charAt(j)]--;  
           j++; 
          }
          max=Math.max(max,(i-j)+1);
        }
        return max;
    }
}
