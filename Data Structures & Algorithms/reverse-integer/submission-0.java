class Solution {
    public int reverse(int x) {
        int a=0;
       while(x!=0){
        int b=x%10;
        x=x/10;
        if(a>Integer.MAX_VALUE/10 || a==Integer.MAX_VALUE/10 &&
        b>7 ){
            return 0;
        }
         if(a<Integer.MIN_VALUE/10 || a==Integer.MIN_VALUE/10 &&
        b<-8 ){
            return 0;
        }
        a=a*10+b;
       }
          return a;
    }
}
