class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;

        int xor = 0;
        boolean hasNonZero = false;

        for(int x : nums)
        {
            xor ^= x;
            if(xor != 0) hasNonZero = true;
        }

        if(xor != 0) return n;

        if(hasNonZero) return n-1;

        return 0;
    }
}