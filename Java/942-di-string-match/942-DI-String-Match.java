class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length(), l=0, r=n;
        int[] res = new int[n+1];

        for(int i=0; i<n; i++)
            res[i] = s.charAt(i) == 'I' ? l++ : r--;

        res[n] = l == n ? r : l;

        return res;
    }
}