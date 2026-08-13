class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        int n = words.length;

        StringBuilder res = new StringBuilder();

        for(int i=0; i<n; i++)
        {
            res.append(reverseWord(words[i]));

            if(i != n-1)
                res.append(" ");
        } 

        return res.toString();
    }

    private static String reverseWord(String word)
    {
        StringBuilder rev = new StringBuilder(word);
        return rev.reverse().toString();
    }
}