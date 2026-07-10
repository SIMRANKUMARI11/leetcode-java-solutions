// LeetCode 409 - Longest Palindrome
// Time: O(n), Space: O(1)

class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[125];

        for(char c : s.toCharArray()) {
            freq[c]++;
        }

        int ans = 0;
        boolean odd = false;

        for(int count : freq) {
            ans += (count / 2) * 2;
            if(count % 2 == 1) {
                odd = true;
            }
        }

        if(odd) ans++;

        return ans;
    }
}
