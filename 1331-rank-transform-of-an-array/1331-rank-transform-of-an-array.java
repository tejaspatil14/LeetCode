import java.util.*;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int val : arr) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        int rank = 1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            map.put(entry.getKey(), rank);
            rank++;
        }

        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = map.get(arr[i]);
        }

        return ans;
    }
}
