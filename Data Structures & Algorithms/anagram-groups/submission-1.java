class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>h=new HashMap<>();
        for(String s:strs){
            String a[]=s.split("");
            Arrays.sort(a);
            String m=String.join("",a);
            if(h.containsKey(m)){
                h.get(m).add(s);
            }
            else{
                h.put(m, new ArrayList<>());
                h.get(m).add(s);
            }
        }
        return new ArrayList<>(h.values());
    }
}
