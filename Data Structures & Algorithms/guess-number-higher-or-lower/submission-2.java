public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 1;
        int h = n;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            int a = guess(mid);

            if (a == 0) {
                return mid;
            }
            else if (a == -1) {
                h = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }

        return -1;
    }
}