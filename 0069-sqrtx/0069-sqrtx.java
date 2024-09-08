class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int y = x;
        while (true) {
            y = y / 2;
            if ((y * y) < 0 || (y * y) / y != y) continue; // handle int overflow
            if ((y * y) > 0 && (y * y) <= x) break;
        }

        if (y * y == x) return y;

        int j = x - (y * y);
        while (true) {
            j = j - (y + y + 1);
            if (j >= 0) {
                y = y + 1;
            } else {
                break;
            }
        }

        return y;
    }
}