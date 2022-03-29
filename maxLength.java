class Solution {
    public int maxLength(List<String> arr) {
        List<String> finalList=new ArrayList<String>();
        int ans=0;
        finalList.add("");
        for(String curr:arr){
            if(!checkForUniqueChar(curr)) continue;
            List<String> tempList=new ArrayList<String>();
            for(String element:finalList){
                String concat=element+curr;
                if(checkForUniqueChar(concat)){
                    tempList.add(concat);
                    ans=Math.max(ans,concat.length());
                }
            }
            finalList.addAll(tempList);
        }
        return ans;
    }

    public boolean checkForUniqueChar(String curr){
        if(curr.length()>26) return false;
        int[] freq=new int[26];
        char[] charArray=curr.toCharArray();
        for(char c:charArray){
            freq[c-'a']++;
            if(freq[c-'a']>1){
                return false;
            }
        }
        return true;
    }
}