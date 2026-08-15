class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length, freq[] = new int[n];
        int[] res = new int[2];

        for(int i=0; i<n; i++)
            freq[nums[i] - 1]++;

        for(int i=0; i<n; i++)
        {
            if(freq[i] == 2)
                res[0] = i+1;
            else if(freq[i] == 0)
                res[1] = i+1;
        }

        return res;
            
    }
}