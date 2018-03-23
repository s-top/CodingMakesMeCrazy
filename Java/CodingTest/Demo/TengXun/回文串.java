package com.lzp.Demo.NiuKeWang;

import java.util.*;
public class Main {

    /*
     *
     * 给定一个字符串s，你可以从中删除一些字符，使得剩下的串是一个回文串。如何删除才能使得回文串最长呢？
       输出需要删除的字符个数。
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.next();
            String s2 = new StringBuilder(s1).reverse().toString();
            int[][] dp = new int[s1.length() + 1][s2.length() + 1];
            for (int i = 1; i < dp.length; i ++ ) {
                for (int j = 1; j < dp[0].length; j ++ ) {
                    dp[i][j] = s1.charAt(i - 1) == s2.charAt(j - 1) ? dp[i - 1][j - 1] + 1 : Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
            System.out.println(s1.length() - dp[s1.length()][s2.length()]);
        }
    }
}
