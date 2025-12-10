class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        int[] map = new int[101]; 
        for (int i = 0; i < n; i++) {
            if (i == 0 || sorted[i] != sorted[i - 1]) {
                map[sorted[i]] = i;
            }
        }
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = map[nums[i]];
        }
        return res;
    }
}
