class Solution {
    public String maximumFrequency(String s) {
        // Code here
        String[] words = s.split(" ");
        HashMap<String, Integer> hm = new HashMap<>();

        int maxFreq = 0;
        for (String word : words) {
            int currentFreq = hm.getOrDefault(word, 0) + 1;
            hm.put(word, currentFreq);
            if (currentFreq > maxFreq) maxFreq = currentFreq;
        }

        for (String word : words) {
            if (hm.get(word) == maxFreq) return word + " " + maxFreq;
        }
        return "";
    }
}