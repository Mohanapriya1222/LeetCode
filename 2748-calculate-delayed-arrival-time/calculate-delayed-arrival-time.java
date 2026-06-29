class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
    int delay= arrivalTime+delayedTime;
    return delay%24;
    }
}