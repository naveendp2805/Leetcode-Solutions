class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int[] freq = new int[128];
        int res = 0;

        for(char ch : jewels.toCharArray())
            freq[ch]++;

        for(char ch : stones.toCharArray())
            if(freq[ch] != 0) res += freq[ch];

        return res;
    }
}