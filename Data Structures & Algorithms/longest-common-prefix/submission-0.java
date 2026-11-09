class Solution {
    public String longestCommonPrefix(String[] s) {
       String p=s[0];
       for(int i=0;i<s.length;i++){
           int j=0;
           while(j<Math.min(p.length(),s[i].length())){
            if(p.charAt(j)!=s[i].charAt(j)){
                break;
            }
            j++;
           }
           p=p.substring(0,j);
       }
       return p;
    }
}