class Solution {
    public boolean search(int[] n, int target) {
       int l=0;
       int h=n.length-1;
       while(l<=h){
        int mid=(l+h)/2;
        if(n[mid]==target) return true;
        else if (n[l] == n[mid] && n[mid] == n[h]) {
                l++;
                h--;
            }
        else if(n[l]<=n[mid]){
            if(n[l]<=target && target<n[mid]){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        else{
            if(n[mid]<target && target<=n[h]){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
       }
       return false; 
    }
}