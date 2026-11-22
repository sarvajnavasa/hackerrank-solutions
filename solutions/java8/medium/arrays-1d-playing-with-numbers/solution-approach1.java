// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/vel-tech-a-3rd-year/challenges/arrays-1d-playing-with-numbers/problem?isFullScreen=true
// Problem     Arrays 1D - Playing with Numbers
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-11-22, 10:29 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int s=sc.nextInt();
        for(int i=s;i<n;i++){
            System.out.print(a[i]+" ");
        }
        for(int i=0;i<s;i++){
            System.out.print(a[i]+" ");
        }
    }
}
