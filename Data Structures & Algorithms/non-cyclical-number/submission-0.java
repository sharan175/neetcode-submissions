class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> s=new HashSet<>();
        while(n!=1 && !s.contains(n)){
            s.add(n);
            n=get(n);
        }
         return n==1;

        }
        public int get(int n){
            int sum=0;
            while(n!=0){
              int total=n%10;
              sum+=total*total;
              n=n/10;
            }
            return sum;
        }
    }
