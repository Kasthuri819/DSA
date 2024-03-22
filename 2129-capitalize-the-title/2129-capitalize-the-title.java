class Solution {
    public String capitalizeTitle(String title) {

       StringBuilder result = new StringBuilder();
        String[] words = title.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() <= 2) {
                result.append(words[i].toLowerCase());
            } else {
                result.append(Character.toUpperCase(words[i].charAt(0)));
                result.append(words[i].substring(1).toLowerCase());
            }

            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}