class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    count++;
                }
            }
            arr2[i] = count;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j])
                    continue;
                if (arr2[i] == arr2[j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
