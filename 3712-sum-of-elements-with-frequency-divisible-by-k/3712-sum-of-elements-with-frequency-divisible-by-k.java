class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);}
        for (int num : nums) {
            if (hm.get(num) % k == 0) {
                sum += num;
            } }
        return sum; }}