// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/vel-tech-a-3rd-year/challenges/functions-perfect-number-detection-for-vault-security/problem?isFullScreen=true
// Problem     Functions - Perfect Number Detection for Vault Security
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-11-20, 11:30 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static int detectPerfectNumber(int n){
      int sum =0;
      for(int i=1;i<n;i++){
        if(n%i==0){
            sum+=i;
        }
      }
      if(sum==n){
        return 1;
      }
      return sum;
    }
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.print(detectPerfectNumber(n));
}
}






