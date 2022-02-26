class Solution {
    public int longestOnes(int[] nums, int k) {
        int flipCount=0;
        int start=0;
        int end=0;
        int maxLen=0;
        for(end=0;end<=nums.length-1;end++){
            if(nums[end]==0)flipCount=flipCount+1;

            if(flipCount>k){
                while(flipCount>=k){
                    if(nums[start]==0)flipCount=flipCount-1;
                    start++;
                }
            }
            maxLen=Math.max(maxLen,(end-start+1));
        }
        return maxLen;
    }
}