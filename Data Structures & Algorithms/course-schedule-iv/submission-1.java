class Solution {
public boolean dfs(List<List<Integer>> a, int i, int j, boolean[] visited) {

    if (i == j) {
        return true;
    }

    visited[i] = true;

    for (int x : a.get(i)) {
        if (!visited[x]) {
            if (dfs(a, x, j, visited)) {
                return true;
            }
        }
    }

    return false;
}
    public List<Boolean> checkIfPrerequisite(int n, int[][] p, int[][] q) {
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(new ArrayList<>());
        }
        for(int i=0;i<p.length;i++){
            l.get(p[i][1]).add(p[i][0]);
        }
        List<Boolean> s=new ArrayList<>();
        for(int i=0;i<q.length;i++){
            boolean v[]=new boolean[n];
            boolean f=dfs(l,q[i][1],q[i][0],v);
            s.add(f);
        }
        return s;
    }
}