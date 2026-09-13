class Solution {
    public int[] plusOne(int[] d) {
       int carry=0;
       int a=d.length-1;
       do{
        d[a]=d[a]+1;
        if(d[a]==10){
            d[a]=0;
            carry=1;
        }
        else{
            carry=0;
        }
        a--;
       }while(carry!=0 && a>=0);
       if(carry==1){
        d=new int[d.length+1];
        d[0]=1;
       } 
     return d;
    }
}
