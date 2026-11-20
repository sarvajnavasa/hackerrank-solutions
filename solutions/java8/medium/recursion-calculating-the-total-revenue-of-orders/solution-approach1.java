// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/vel-tech-a-3rd-year/challenges/recursion-calculating-the-total-revenue-of-orders/problem?isFullScreen=true
// Problem     Recursion - Calculating the Total Revenue of Orders
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-11-20, 02:48 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;
public class Main {
    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
