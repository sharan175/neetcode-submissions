class Solution {
    public double myPow(double x, int n) {
        long N=n;
        if(N<0){
            x=1/x;
            N=0-N;
        }
        double sum=1;
        while(N>0){
            if(N%2==1){
                sum=sum*x;
            }
            x*=x;
            N=N/2;
        }
        return sum;
    }
}
