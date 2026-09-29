class Solution {
    public boolean lemonadeChange(int[] bi) {
       int a=0;
       int b=0;
       int c=0;
       for(int i=0;i<bi.length;i++){
        if(bi[i]==5){
            a++;
        }
        else if(bi[i]==10){
            if(a==0) return false;
            a--;
            b++;
        }
        else{
            if(a==0)  return false;
            if(b==0){
                if(a>2){
                    a=a-3;
                }
                else{
                    return false;
                }
            }
            else{
                a--;
                b--;
            }
        }
       }
        return true;
    }
}