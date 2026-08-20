class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        Stack<Integer> arr1 = new Stack<>(), arr2 = new Stack<>();
        arr1.push(nums[0]);
        arr2.push(nums[1]);

        for(int i=2; i<n; i++)
        {
            if(arr1.peek() > arr2.peek())
                arr1.push(nums[i]);
            else
                arr2.push(nums[i]);
        }

        int i = n-1;
        while(!arr2.isEmpty())
            res[i--] = arr2.pop();

        while(!arr1.isEmpty())
            res[i--] = arr1.pop();

        return res;
    }
}