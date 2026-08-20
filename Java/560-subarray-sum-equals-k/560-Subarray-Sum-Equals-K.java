class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = nums.length, sum = 0, c=0;

        for(int i=0; i<n; i++)
        {
            sum += nums[i];

            if(sum == k)
                c++;

            if(hm.containsKey(sum - k))
                c += hm.get(sum - k);

            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }

        return c;
    }
}