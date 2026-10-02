class Solution {
    public int calPoints(String[] o) {
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < o.length; i++) {
            char a = o[i].charAt(0);

            if (a == '+') {
                int x = s.pop();
                int y = s.pop();

                s.push(y);
                s.push(x);
                s.push(x + y);
            }
            else if (a == 'C') {
                s.pop();
            }
            else if (a == 'D') {
                int x = s.pop();

                s.push(x);
                s.push(x * 2);
            }
            else {
                s.push(Integer.parseInt(o[i]));
            }
        }

        int sum = 0;

        while (!s.isEmpty()) {
            sum += s.pop();
        }

        return sum;
    }
}