class Solution {
    public String capitalizeTitle(String title) {

        String[] words = title.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (word.length() <= 2) {
                // Rule 1: all lowercase
                result.append(word.toLowerCase());
            } else {
                // Rule 2: first uppercase, rest lowercase
                result.append(
                    Character.toUpperCase(word.charAt(0)) +
                    word.substring(1).toLowerCase()
                );
            }

            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
