class Solution {
    public int maximumLengthSubstring(String s) {
        int res = 0;
        int i=0, n=s.length();
        HashMap<Character, Integer> map = new HashMap<>();

        for(int j=0; j<n; j++)
        {
            char ch = s.charAt(j);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while(map.get(ch) > 2)
                map.put(s.charAt(i), map.get(s.charAt(i++)) - 1);

            res = Math.max(res, j - i + 1);
        }

        return res;
    }
}