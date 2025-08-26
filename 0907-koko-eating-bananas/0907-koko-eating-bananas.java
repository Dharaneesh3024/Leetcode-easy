class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Arrays.stream(piles).max().orElseThrow();
        int left = 1, right = max;

        while (left < right) {
            int speed = (left + right) / 2;
            int totalHours = 0;

            for (int pile : piles) {
                totalHours += (pile + speed - 1) / speed;
            }

            if (totalHours <= h) {
                right = speed;
            } else {
                left = speed + 1;
            }
        }

        return left;
    }
}
