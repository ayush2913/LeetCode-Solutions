//739. Daily Temperatures
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] ans = new int [temperatures.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int idx = temperatures.length - 1; idx >= 0; idx --) {
            ans [idx] = Integer.MAX_VALUE;
            for (Integer t : map.keySet())
                if (temperatures [idx] < t) ans [idx] = Math.min (ans [idx], map.get (t) - idx);
            map.put (temperatures [idx], idx);
            if (ans [idx] == Integer.MAX_VALUE) ans [idx] = 0;
        }
        return ans;
    }
}