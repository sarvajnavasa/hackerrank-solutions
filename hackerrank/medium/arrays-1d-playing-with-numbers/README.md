# Arrays 1D - Playing with Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Ryan is given an array of random integers of size n, a number d is provided to him along with this array. He needs to develop a logic such that it shifts the given array elements by d positions towards the left. Write a function for him and return the updated array.

 **Input Format** 

- An integer n i.e., size of the array
- Integer array which are elements of the array.
- Integer d

 **Constraints** 

NA

 **Output Format** 

Return the updated array after the shift.

 **Sample Input 0** 

```
7  
1 2 3 4 5 6 7  
2  

```

 **Sample Output 0** 

```
3 4 5 6 7 1 2 

```

 **Explanation 0** 

For the given d, i.e., 2 for above case such element is shifted by 2 places to left, and the initial 2 elements are required to be shifted from behind, hence array is being rotated

 **Sample Input 1** 

```
9  
1 7 8 5 4 6 0 2 3  
3

```

 **Sample Output 1** 

```
5 4 6 0 2 3 1 7 8

```

 **Explanation 1** 

As the elements are shifted 3 positions to the left, therefore initial 3 elements after being shifted appear at the tail of the array and accordingly other elements are shifted 3 positions towards left.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-22T16:59:58.989Z  

```java
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

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/arrays-1d-playing-with-numbers/problem)