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






