// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/vel-tech-a-3rd-year/challenges/arrays-1d-data-recovery-reversing-the-sensor-log/problem?isFullScreen=true
// Problem     Arrays 1D - Data Recovery - Reversing the Sensor Log
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-11-22, 10:41 p.m.
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
       for(int i=n-1;i>=0;i--){
        System.out.print(a[i]+" ");
       }
    }
}
