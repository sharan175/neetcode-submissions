class Solution {
    public boolean checkValidString(String s) {
       int mincount=0;
       int maxcount=0;
       for(int i=0;i<s.length();i++){
        char a=s.charAt(i);
        if(a=='('){
         mincount++;
         maxcount++;
        } 
        else if(a==')'){
            mincount--;
            maxcount--;
        }
        else{
            mincount--;
            maxcount++;
        }
        if(maxcount<0){
            return false;
        }
        mincount=Math.max(mincount,0);
       }
       return mincount==0;
    }
}
