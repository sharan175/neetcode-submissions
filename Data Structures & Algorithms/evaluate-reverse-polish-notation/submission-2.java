class Solution {
    public int evalRPN(String[] t) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<t.length;i++){
             if(Character.isDigit(t[i].charAt(0))||t[i].length()>1){
                int k=Integer.parseInt(t[i]);
                s.push(k);
             }
             else{
                int b=s.pop();
                int a=s.pop();
                int c=0;
                if(t[i].equals("+")){
                 c=a+b;
                }
                else if(t[i].equals("-")){
                    c=a-b;
                }
                else if(t[i].equals("*")){
                    c=a*b;
                }
                else if(t[i].equals("/")){
                   c=a/b;
                }
                s.push(c);
             }

        }
        return s.peek();
    }
}
