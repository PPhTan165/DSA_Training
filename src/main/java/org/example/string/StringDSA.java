package org.example.string;

import java.lang.classfile.constantpool.ClassEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringDSA {
    private String str;

    public void showVowels(String str) {
        List<java.lang.String> vowels = new ArrayList<>();
        StringBuilder vowel = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (isVowel(c)) {
                vowel.append(c);

                if (vowel.length() == 3) {
                    vowels.add(vowel.toString());
                    vowel.setLength(0);
                }
            } else {
                vowel.setLength(0);
            }
        }
        System.out.println(vowels);

    }

    public void firstNonRepeatCharacter(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.compute(c, (key, val) -> (val + 1));
            }
        }

        for (char c : str.toCharArray()) {
            if (map.get(c) == 1) {
                System.out.println(c);
                break;
            }
        }
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        for (char c : str1.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        for (char c : str2.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            }
            map.put(c, map.get(c) - 1);
            if (map.get(c) < 0) {
                return false;
            }
        }
        return true;
    }

    //242 valid anagram
    //Chỉ áp dụng khi đề cho Chữ là toàn bộ là lowercase or uppercase trong range a-z
    public static boolean isAnagramLowerCase(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int num : count) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }
    //14 Longest common prefix
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];

        for (int j = 0; j < prefix.length(); j++) {
            char c = prefix.charAt(j);

            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() == j || strs[i].charAt(j) != c) {
                    return prefix.substring(0, j);
                }
            }
        }
        return prefix;
    }

    //680. invalid palindrome II
    public static boolean validPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) == str.charAt(right)) {

                left++;
                right--;

            } else {
                boolean skipL = checkPalindrome(str, left + 1, right);
                boolean skipR = checkPalindrome(str, left, right - 1);

                return skipL || skipR;
            }
        }
        return true;
    }

    public static boolean checkPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }


    // 5. Longest Palindrome Substring
    public static String longestPalindromeSubstring(String s) {
        if(s == null || s.isEmpty()) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {

            int oddLength = expand(s, i, i);
            int evenLength = expand(s, i, i + 1);

            int length = Math.max(oddLength, evenLength);

            if ((end - start + 1) < length) {
                start = i - (length - 1) / 2;
                end = i + length / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public static int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }


    public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
