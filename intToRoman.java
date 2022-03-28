class Solution {
    public String intToRoman(int num) {
        Map<Integer, String> mp = new HashMap<>();
        mp.put(1,"I");
        mp.put(4,"IV");
        mp.put(5,"V");
        mp.put(9,"IX");
        mp.put(10,"X");
        mp.put(40,"XL");
        mp.put(50,"L");
        mp.put(90,"XC");
        mp.put(100,"C");
        mp.put(400,"CD");
        mp.put(500,"D");
        mp.put(900,"CM");
        mp.put(1000,"M");

        String res="";

        int[] l = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        for(int i=0;i<l.length;i++){
            int numOfSymbols=num/l[i];
            String symbol=mp[l[i]];
            if(numOfSymbols!=0) res+=symbol.repeat(numOfSymbols);
            num=num%i;
        }
        return res;
    }
}