class Solution {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();

        String[] a = path.split("/");

        for (String k : a) {

            if (k.equals("") || k.equals(".")) {
                continue;
            }

            if (k.equals("..")) {
                if (!s.isEmpty()) {
                    s.pop();
                }
            } 
            else {
                s.push(k);
            }
        }

        String m = "";

        while (!s.isEmpty()) {
            m = "/" + s.pop() + m;
        }

        return m.isEmpty() ? "/" : m;
    }
}