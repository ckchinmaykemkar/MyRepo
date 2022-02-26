class Solution {
    public int[] twoSum(int[] nums, int target) {
        int start=0;
        int end=0;
        for(int i=0;i<=nums.length;i++){
            int sum=0;
            for(int j=i+1;j<=nums.length-1;j++){
                sum=nums[i]+nums[j];
                if(sum==target){
                    start=i;
                    end=j;
                    break;
                }
            }
        }
        return new int[]{start,end};
    }
}