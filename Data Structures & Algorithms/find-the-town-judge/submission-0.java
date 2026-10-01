class Solution {
    public int findJudge(int n, int[][] trust) {
    int tr[]=new int[n+1];
    int c[]=new int[n+1];
    for(int a[]:trust){
        tr[a[1]]++;
        c[a[0]]++;
    }
    for(int i=1;i<=n;i++){
        if(tr[i]==n-1 && c[i]==0){
            return i;
        }
    }
    return -1;
    }
}