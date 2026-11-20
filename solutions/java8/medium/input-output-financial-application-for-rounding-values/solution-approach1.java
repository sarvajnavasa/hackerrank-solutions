// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/vel-tech-a-3rd-year/challenges/input-output-financial-application-for-rounding-values/problem?isFullScreen=true
// Problem     Input & Output - Financial Application for Rounding Values
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-11-20, 11:43 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n= sc.nextDouble();
        System.out.println((int)n);
        System.out.println((int)Math.ceil(n));
        System.out.println((int) Math.floor(n));
        
        
    }
}
