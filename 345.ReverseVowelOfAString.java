class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray(); // Convert the string to a mutable char array
        int low = 0;
        int high = s.length() - 1;
        while (low < high) {
            char l = chars[low];
            char h = chars[high];
            if (l != 'a' && l != 'e' && l != 'i' && l != 'o' && l != 'u' &&
                l != 'A' && l != 'E' && l != 'I' && l != 'O' && l != 'U') {
                low++;
            } else if (h != 'a' && h != 'e' && h != 'i' && h != 'o' && h != 'u' &&
                       h != 'A' && h != 'E' && h != 'I' && h != 'O' && h != 'U') {
                high--;
            } else {
                // Swap the vowels
                chars[low] = h;
                chars[high] = l;
                low++;
                high--;
            }
        }
        return new String(chars); // Convert the char array back to a String
    }
}
