class Solution {
    public boolean isAnagram(String s, String t) {
        int[] k=new int[126];
        for(int i=0;i<s.length();i++){
            k[s.charAt(i)]++;

        }
        for(int i=0;i<t.length();i++){
            k[t.charAt(i)]--;
        }
        for(int i=0;i<k.length;i++){
            if(k[i]!=0){
                return false;
            }
        }
        return true;
    }
}
