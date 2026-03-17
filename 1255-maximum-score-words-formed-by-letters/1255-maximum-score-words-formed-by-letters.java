class Solution {
    int maxScore = 0;

    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] freq = new int[26];

        // count letters
        for (char c : letters) {
            freq[c - 'a']++;
        }

        backtrack(words, score, freq, 0, 0);
        return maxScore;
    }

    void backtrack(String[] words, int[] score, int[] freq, int idx, int currScore) {
        if (idx == words.length) {
            maxScore = Math.max(maxScore, currScore);
            return;
        }

        // OPTION 1: skip word
        backtrack(words, score, freq, idx + 1, currScore);

        // OPTION 2: take word (if possible)
        String word = words[idx];
        int[] temp = new int[26];
        int wordScore = 0;
        boolean canTake = true;

        for (char c : word.toCharArray()) {
            int i = c - 'a';
            temp[i]++;
            if (temp[i] > freq[i]) {
                canTake = false;
                break;
            }
            wordScore += score[i];
        }

        if (canTake) {
            // use letters
            for (int i = 0; i < 26; i++) {
                freq[i] -= temp[i];
            }

            backtrack(words, score, freq, idx + 1, currScore + wordScore);

            // backtrack (restore)
            for (int i = 0; i < 26; i++) {
                freq[i] += temp[i];
            }
        }
    }
}