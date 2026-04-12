class Solution {
    public boolean isPalindrome(String s) {

    int left = 0;
    int right = s.length() - 1;

    while (left < right) {

        char l = s.charAt(left);
        char r = s.charAt(right);

        // skip non-alphanumeric from left
        if (!Character.isLetterOrDigit(l)) {
            left++;
            continue;
        }

        // skip non-alphanumeric from right
        if (!Character.isLetterOrDigit(r)) {
            right--;
            continue;
        }

        // compare (case-insensitive)
        if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
            return false;
        }

        left++;
        right--;
    }

    return true;
}
    
}
