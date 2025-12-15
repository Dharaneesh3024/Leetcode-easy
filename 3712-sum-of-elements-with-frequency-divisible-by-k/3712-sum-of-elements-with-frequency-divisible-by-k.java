class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            if (freq % k == 0) {
                sum += num * freq;
            }
        }
        return sum;
    }
}
