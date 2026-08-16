class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] d = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",     "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        HashSet<String> set = new HashSet<>();

        for(String word : words)
        {
            StringBuilder s = new StringBuilder();
            int n = word.length();

            for(int i=0; i<n; i++)
                s.append(d[word.charAt(i) - 'a']);

            set.add(s.toString());
        }

        return set.size();
    }
}