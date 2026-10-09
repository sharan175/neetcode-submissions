class Solution {
    public void sortColors(int[] a) {
      int i=0;
      int j=a.length-1;
      int mid=0;
      while(mid<=j){
        if(a[mid]==0){
            int temp=a[mid];
            a[mid]=a[i];
            a[i]=temp;
            i++;
            mid++;
        }
        else if(a[mid]==1){
            mid++;
        }
        else{
            int temp=a[mid];
            a[mid]=a[j];
            a[j]=temp;
            j--;
        }
      }
    }
}