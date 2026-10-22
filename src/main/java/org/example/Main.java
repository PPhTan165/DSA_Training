package org.example;

import org.example.string.StringDSA;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        String[] strs = {"flower", "flow", "flight"};
        String s = "cbbd";

        String longest = StringDSA.longestPalindromeSubstring(s);

        System.out.println(longest);

    }
}


