class Solution {
    public int characterReplacement(String s, int k) {
        int a[]=new int[128];
        int j=0;
        int max=0;
        int maxFreq=0;
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)]++;
           maxFreq = Math.max(maxFreq, a[s.charAt(i)]);

            while ((i - j + 1) - maxFreq > k) {
                a[s.charAt(j)]--;
                j++;
            }

            max=Math.max(max,(i-j)+1);
        }
        return max;
    }
}
