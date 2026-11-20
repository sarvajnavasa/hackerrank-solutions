// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/vel-tech-a-3rd-year/challenges/recursion-calculating-factorials-for-the-space-expedition/problem?isFullScreen=true
// Problem     Recursion - Calculating Factorials for the Space Expedition
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-11-20, 02:43 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {
    public static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*fact(n-1);
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       System.out.println(fact(n));
    }
}
