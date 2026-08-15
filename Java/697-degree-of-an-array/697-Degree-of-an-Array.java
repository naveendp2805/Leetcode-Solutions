class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> first = new HashMap<>(), freq = new HashMap<>();

        int degree = 0, res = 0;

        for(int i=0; i<nums.length; i++)
        {
            int ele = nums[i];

            first.putIfAbsent(ele, i);
            freq.put(ele, freq.getOrDefault(ele, 0) + 1);

            if(freq.get(ele) > degree)
            {
                degree = freq.get(ele);
                res = i - first.get(ele) + 1;
            } else if(freq.get(ele) == degree)
                res = Math.min(res, i - first.get(ele) + 1);
        }

        return res;
    }
}