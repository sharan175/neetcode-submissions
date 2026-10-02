class Solution {
    public int shipWithinDays(int[] w, int days) {
        int l=0;
        int h=0;
        for(int i=0;i<w.length;i++){
            l=Math.max(l,w[i]);
            h+=w[i];
        }
       while(l<h){
        int mid=(l+h)/2;
        int day=1;
        int sum=0;
        for(int i=0;i<w.length;i++){
            sum=sum+w[i];
            if(sum>mid){
                day++;
                sum=w[i];
            }
        }
        if(day<=days){
              h=mid;
        }
        else{
          l=mid+1;
        }
       }
       return l;
    }
}