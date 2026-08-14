class Solution {
    public boolean backspaceCompare(String s, String t) {
        return solve(s).equals(solve(t));
    }

    private static String solve(String s)
    {
        int n = s.length();
        StringBuilder res = new StringBuilder();

        for(int i=0; i<n; i++)
        {
            char ch = s.charAt(i);
            int len = res.length();

            if(ch == '#')
            {
                if(len > 0) res.deleteCharAt(len - 1);
            }
            else   
                res.append(ch);
        }

        return res.toString();
    }
}