class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
      int n=intervals.length;
      Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
      int ans=0;
      int cet=Integer.MIN_VALUE;
      for(int i=0;i<n;i++) {
        if(intervals[i][0]>=cet){
            cet=intervals[i][1];
        }
        else{
            ++ans;
        }
      }
      return ans;
    }
}