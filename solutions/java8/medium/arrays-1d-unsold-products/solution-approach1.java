// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/vel-tech-a-3rd-year/challenges/arrays-1d-unsold-products/problem?isFullScreen=true
// Problem     Arrays 1D - Unsold Products
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-11-21, 10:24 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int insertPos = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[insertPos] = arr[i];
                insertPos++;
            }
        }
        while (insertPos < n) {
            arr[insertPos] = 0;
            insertPos++;
        }
       for (int i = 0; i < n; i++) {
    System.out.print(arr[i]);
    if (i < n - 1) {
        System.out.print(" ");
    }
}
        sc.close();
    }
}
