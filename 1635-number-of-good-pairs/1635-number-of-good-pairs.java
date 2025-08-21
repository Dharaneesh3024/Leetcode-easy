class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int ele : nums) {
            hm.put(ele, hm.getOrDefault(ele, 0) + 1);
        }
        int sum = 0;
        for (Map.Entry<Integer, Integer> pair : hm.entrySet()) {
            int n = pair.getValue();
            sum += (n * (n - 1)) / 2;
        }
        return sum;
    }
}