class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char a=Character.toUpperCase(s.charAt(i));
            char b=Character.toUpperCase(s.charAt(j));
            if(Character.isLetterOrDigit(a) && Character.isLetterOrDigit(b)){
                if(a!=b) return false;
                i++;
                j--;
            }
            else if(!Character.isLetterOrDigit(a)){
                 i++;
            }
            else{
                j--;
            }
        }
       return true;
    }
}
