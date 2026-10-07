class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
       int diff[]=new int[arr.length];
       for(int i=0;i<arr.length;i++){
        diff[i]=Math.abs(arr[i]-x);
       } 
      
       Integer a[]=new Integer[arr.length];
       for(int i=0;i<a.length;i++){
        a[i]=i;
       }
       Arrays.sort(a,(j,q)->diff[j]-diff[q]);
       List<Integer> l=new ArrayList<>();
       for(int i=0;i<k;i++){
          l.add(arr[a[i]]);
       }
       Collections.sort(l);
       return l;
    }
}