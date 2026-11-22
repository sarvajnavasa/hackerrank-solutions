// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/vel-tech-a-3rd-year/challenges/arrays-1d-finding-the-median-of-positive-product-ids/problem?isFullScreen=true
// Problem     Arrays 1D - Finding the Median of Positive Product IDs
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-11-22, 09:49 p.m.
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
        int c=0;
        for(int i=0;i<n;i++){
            if(a[i]>0){
                a[c]=a[i];
                c++;
             }
        }
        if(c==0){
            System.out.print("-1");
        }
        else{
        System.out.print(a[c/2]);
        }
    }
}
