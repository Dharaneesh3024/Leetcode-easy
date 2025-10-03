class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int totaltime=arrivalTime+delayedTime;
        if(totaltime>23){
            return totaltime-24;
        }
        else{
            return totaltime;
        }
    }
}