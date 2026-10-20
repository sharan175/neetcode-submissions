class Solution {
    int max=0;
    int l=0;
    int h=0;
    public void sub(int i,int j,String s){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            if((j-i+1)>max){
                l=i;
                h=j;
                max=(j-i+1);
            }
            i--;
            j++;
        }

    }
    public String longestPalindrome(String s) {
       for(int i=0;i<s.length();i++){
          sub(i,i,s);
          sub(i,i+1,s);
       }
       String a="";
       for(int i=l;i<=h;i++){
        a+=s.charAt(i);
       }
       return a; 
    }
}
