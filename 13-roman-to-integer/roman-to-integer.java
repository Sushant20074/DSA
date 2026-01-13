import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        // Create a map to store the values of Roman numerals
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int total = 0;
        int length = s.length();

        // Iterate through the string
        for (int i = 0; i < length; i++) {
            int currentValue = romanValues.get(s.charAt(i));
            
            // Check if the next value exists and is larger than the current value
            if (i + 1 < length && romanValues.get(s.charAt(i + 1)) > currentValue) {
                // Subtraction case
                total -= currentValue;
            } else {
                // Addition case
                total += currentValue;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage
        String s1 = "III";
        System.out.println(solution.romanToInt(s1));  // Output: 3

        String s2 = "LVIII";
        System.out.println(solution.romanToInt(s2));  // Output: 58

        String s3 = "MCMXCIV";
        System.out.println(solution.romanToInt(s3));  // Output: 1994
    }
}
