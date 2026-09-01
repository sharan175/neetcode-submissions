class Solution {
    public boolean isValid(String s) {
        Stack<Character> k=new Stack<>();
        for(int i=0;i<s.length();i++){
          char a=s.charAt(i);
          
          if(!k.isEmpty() && a==k.peek()){
            k.pop();
          }
          else if(a=='[' ){
            k.push(']');
          }
          else if(a=='(' ){
            k.push(')');
          }
          else if(a=='{'){
            k.push('}');
          }
          else{
            k.push('9');
          }
        }
        return k.isEmpty();
    }
}
