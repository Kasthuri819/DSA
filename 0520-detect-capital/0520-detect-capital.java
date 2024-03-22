class Solution {
    public boolean detectCapitalUse(String word) {
        
       int countUpperCase = 0;
        int countLowerCase = 0;

        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                countUpperCase++;
            } else {
                countLowerCase++;
            }
        }

        return countUpperCase == word.length() || countLowerCase == word.length()
                || (Character.isUpperCase(word.charAt(0)) && countLowerCase == word.length() - 1);
    }
}