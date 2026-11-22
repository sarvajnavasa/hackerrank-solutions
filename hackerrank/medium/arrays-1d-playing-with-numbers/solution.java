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
