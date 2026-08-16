class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        
        int[] freq = countFreq(licensePlate);
        String res = null;

        for(String word : words)
        {
            int[] freqi = countFreq(word);

            if(completes(freq, freqi))
            {
                if(res == null || word.length() < res.length())
                    res = word;
            }
        }

        return res;
    }

    private static boolean completes(int[] freq, int[] freqi)
    {
        for(int i=0; i<26; i++)
        {
            if(freqi[i] < freq[i]) return false;
        }

        return true;
    }

    private static int[] countFreq(String word)
    {
        int[] freq = new int[26];

        for(char ch : word.toCharArray())
        {
            if(Character.isLetter(ch))
                freq[Character.toLowerCase(ch) - 'a']++;
        }

        return freq;
    }
}