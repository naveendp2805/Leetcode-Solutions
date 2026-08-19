class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer, Integer> reserved = new HashMap<>();
        for(int[] r : reservedSeats)
        {
            int row = r[0], seat = r[1];
            reserved.merge(row, 1 << (10 - seat), (a, b) -> a | b);
        }

        int[] possibleSeats = {0b0111100000, 0b0000011110, 0b0001111000};
        int res = (n - reserved.size()) * 2;

        for(int x : reserved.values())
        {
            for(int s : possibleSeats)
            {
                if((x & s) == 0)
                {
                    res++;

                    x |= s;
                }
            }
        }

        return res;
    }
}