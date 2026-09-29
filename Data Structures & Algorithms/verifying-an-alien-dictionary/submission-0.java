class Solution {
    public boolean isAlienSorted(String[] w, String o) {
        int a[]=new int[128];
        for(int i=0;i<o.length();i++){
            a[o.charAt(i)]=i;
        }
        for(int i=1;i<w.length;i++){
            String t=w[i-1];
            String u=w[i];
            int k=0;
            if(t.startsWith(u) && t.length()>u.length()){
              return false;
            }
            while(k<t.length() && k<u.length()){
                if (a[t.charAt(k)] != a[u.charAt(k)]) {
    if (a[t.charAt(k)] > a[u.charAt(k)]) {
        return false;
    }
    break;
}
                k++;
            }
        }

        return true;
    }
}