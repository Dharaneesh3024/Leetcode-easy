import java.util.*;

class Solution {
    public int countDays(int totalDays, int[][] meetings) {
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));

        List<int[]> mergedMeetings = new ArrayList<>();
        for (int[] meeting : meetings) {
            if (mergedMeetings.isEmpty() || meeting[0] > mergedMeetings.get(mergedMeetings.size() - 1)[1]) {
                mergedMeetings.add(meeting);
            } else {
                int lastIndex = mergedMeetings.size() - 1;
                mergedMeetings.get(lastIndex)[1] = 
                    Math.max(mergedMeetings.get(lastIndex)[1], meeting[1]);
            }
        }

        int occupiedDays = 0;
        for (int[] m : mergedMeetings) {
            occupiedDays += (m[1] - m[0] + 1);
        }

        return totalDays - occupiedDays;
    }
}
