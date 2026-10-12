class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < a.length; i++) {
            boolean b = true;

            if (a[i] > 0) {
                s.push(a[i]);
            } else {
                while (!s.isEmpty() && s.peek() > 0
                        && s.peek() <= -(a[i]) && b) {
                    if (s.pop() == -(a[i])) {
                        b = false;
                        break;
                    }
                }
            }

            if (b && (s.isEmpty() || s.peek() < 0)) {
                s.push(a[i]);
            }
        }

        int[] res = new int[s.size()];

        for (int i = 0; i < s.size(); i++) {
            res[i] = s.get(i);
        }

        return res;
    }
}