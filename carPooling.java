class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] occupancy=new int[1001];

        for(int i=0;i<trips.length;i++){
            occupancy[trips[i][1]]+=trips[i][0];
            occupancy[trips[i][2]]-=trips[i][0];
        }
        int currentCapacity=0;
        for(int occupants:occupancy){
            currentCapacity+=occupants;
            if(currentCapacity>capacity){
                return false;
            }
        }
        return true;

    }
}