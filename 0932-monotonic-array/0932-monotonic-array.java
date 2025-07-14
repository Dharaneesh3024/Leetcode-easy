class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true;
        boolean dec = true;

        for (int i = 1; i < nums.length; i++) {
            int a = nums[i], b = nums[i - 1];
            if (a > b) dec = false;
            else if (a < b) inc = false;
            if (!inc && !dec) return false; 
        }

        return true;
    }
}
