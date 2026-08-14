class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0, j=nums.length-1;

        while(i < j)
        {
            boolean leftOdd = (nums[i] & 1) == 1, rightEven = (nums[j] & 1) == 0;

            if(leftOdd && rightEven)
            {
                int t = nums[i];
                nums[i++] = nums[j];
                nums[j--] = t;
            } else if(!leftOdd)
                i++;
            else
                j--;
        }

        return nums;
    }
}