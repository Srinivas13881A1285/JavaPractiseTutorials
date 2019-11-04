
package com.ideserve.virendra.questions;

/**
 * <b>IDeserve <br>
 * <a href="https://www.youtube.com/c/IDeserve">https://www.youtube.com/c/IDeserve</a>
 * <br><br>
 * Given a String S, find the longest palindromic substring</b><br>
 * <br><br>
 * Example: <br>
 * Input String: <br>
 * "banana"
 * <br>
 * Output: <br>
 * "anana"
 * <br><br>
 * <a href="https://www.youtube.com/watch?v=obBdxeCx_Qs">Longest Palindromic Substring Solution Youtube Link</a> 
 * @author Saurabh
 *
 */
public class LongestPalindromicSubstring {

    public static boolean LPS(String s) {
        int n = s.length();
        boolean isPalindrome = true;
        boolean palindrome[][] = new boolean[n][n]; //boolean table to store palindrome truth
        for (int i = 0; i < n; i++) {
            palindrome[i][i] = true;
        }
        for (int curr_len = 3; curr_len <= n; curr_len=curr_len+2) {
            for (int i = 0; i < n-curr_len+1; i++) {
                int j = i+curr_len-1;
                if (s.charAt(i) == s.charAt(j) //1. The first and last characters should match
                        && palindrome[i+1][j-1]) //2. Rest of the substring should be a palindrome
                {
                    palindrome[i][j] = true;
                }
                else
                    isPalindrome =false;
            }
        }
        return
                isPalindrome;
    }

    public static void main(String args[])
    {
        System.out.println(LPS("aaa"));
    }
}