class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> map = new HashMap<>();
        Set<String> ban = new HashSet<>(Arrays.asList(banned));

        String[] words = paragraph.replaceAll("\\W+", " ").toLowerCase().split("\\s+");

        for(String word : words)
            if(!ban.contains(word))
                map.put(word, map.getOrDefault(word, 0) + 1);

        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}