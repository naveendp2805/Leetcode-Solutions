class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int s = Integer.MAX_VALUE, e = -1;
        List<Integer> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int num : nums)
        {
            s = Math.min(s, num);
            e = Math.max(e, num);
            set.add(num);
        }

        for(int i=s+1; i<e; i++)
            if(!set.contains(i))
                res.add(i);

        return res;
    }
}