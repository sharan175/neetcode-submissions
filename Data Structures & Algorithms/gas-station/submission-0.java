class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    int tg=0;
    int tc=0;
    for(int i=0;i<gas.length;i++){
        tg+=gas[i];
        tc+=cost[i];
    }
    if(tc>tg){
        return -1;
    }
    int g=0;
    int s=0;
    for(int i=0;i<gas.length;i++){
        g=g+gas[i]-cost[i];
        if(g<0){
            s=i+1;
            g=0;
        }
    }
    return s;
    }
}
