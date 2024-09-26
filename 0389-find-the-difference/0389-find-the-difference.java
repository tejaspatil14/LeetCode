class Solution {
    public char findTheDifference(String s, String t) {
        int s_sum = 0, t_sum = 0;
        for (char c : s.toCharArray()) {
            s_sum += (int) c;
        }
        for (char c : t.toCharArray()) {
            t_sum += (int) c;
        }
        return (char) (t_sum - s_sum);
    }
}