class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if (n % 2 != 0) return new int[0];

        int[] cnt = new int[200001];
        for (int x : changed) cnt[x]++;

        int[] ans = new int[n / 2];
        int idx = 0;

        for (int i = 0; i < cnt.length; i++) {
            while (cnt[i] > 0) {
                if (i * 2 >= cnt.length || cnt[i * 2] <= 0) {
                    return new int[0];
                }
                cnt[i]--;
                cnt[i * 2]--;
                ans[idx++] = i;
            }
        }
        return ans;
    }
}
