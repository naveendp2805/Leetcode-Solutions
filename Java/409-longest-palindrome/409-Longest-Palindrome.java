class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int n = s.length(), oddCount = 0;

        for(char ch : s.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if(map.get(ch) % 2 == 1) oddCount++;
            else oddCount--;
        }

        return oddCount > 1 ? n - oddCount + 1 : n;
    }
}