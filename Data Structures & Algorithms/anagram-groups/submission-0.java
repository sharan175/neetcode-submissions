class Solution { 
    public List<List<String>> groupAnagrams(String[] strs) { 
        HashMap<String,List<String>> k=new HashMap<>(); 
        for(int i=0;i<strs.length;i++){ 
            String[] s=strs[i].split(""); 
            Arrays.sort(s); 
            String a=String.join("",s);
            if(k.containsKey(a)){ 
                k.get(a).add(strs[i]); 
            } 
            else{ 
                List<String> o=new ArrayList<>(); 
                o.add(strs[i]); 
                k.put(a,o); 
            } 
        } 
        return new ArrayList<>(k.values()); 
    } 
} 
