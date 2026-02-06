// class Solution {
//     public String toLowerCase(String s) {

//         StringBuilder result = new StringBuilder();

//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);

//             // Check if character is uppercase
//             if (ch >= 'A' && ch <= 'Z') {
//                 ch = (char) (ch + 32); // Convert to lowercase
//             }

//             result.append(ch);
//         }

//         return result.toString();
//     }
// }

class Solution {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }
}