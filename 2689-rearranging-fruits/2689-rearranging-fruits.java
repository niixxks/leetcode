import java.util.*;

class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        Map<Integer, Integer> freq = new HashMap<>();
        int minElement = Integer.MAX_VALUE;

        for (int x : basket1) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
            minElement = Math.min(minElement, x);
        }

        for (int x : basket2) {
            freq.put(x, freq.getOrDefault(x, 0) - 1);
            minElement = Math.min(minElement, x);
        }

        List<Integer> extra = new ArrayList<>();

        for (int x : freq.keySet()) {
            int count = freq.get(x);
            if (count % 2 != 0) return -1;
            for (int i = 0; i < Math.abs(count) / 2; i++) {
                extra.add(x);
            }
        }

        Collections.sort(extra);

        long cost = 0;
        int m = extra.size();
        for (int i = 0; i < m / 2; i++) {
            cost += Math.min(extra.get(i), 2 * minElement);
        }

        return cost;
    }
}
