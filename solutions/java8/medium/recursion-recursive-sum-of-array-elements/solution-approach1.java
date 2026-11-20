// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/vel-tech-a-3rd-year/challenges/recursion-recursive-sum-of-array-elements/problem?isFullScreen=true
// Problem     Recursion - Recursive Sum of Array Elements
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-11-20, 02:57 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;
public class Main {
    static int sum(int[] a, int n) {
        if (n == 0) {
            return 0;
        }
        return a[n - 1] + sum(a, n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(sum(a, n));
    }
}
