import java.util.Hashtable;

class Solution {
    public int mostFrequent(int[] nums, int key) {
        Hashtable<Integer, Integer> ht1 = new Hashtable<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                int next = nums[i + 1];
                ht1.put(next, ht1.getOrDefault(next, 0) + 1);
            }
        }
        int maxKey = 0;
        int maxVal = 0;
        for (int k : ht1.keySet()) {
            if (ht1.get(k) > maxVal) {
                maxVal = ht1.get(k);
                maxKey = k;
            }
        }

        return maxKey;

    }
}
