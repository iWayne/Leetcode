/**
* Q: Fibonacci Modified
* S: BigInteger
* Link: https://www.hackerrank.com/challenges/fibonacci-modified
**/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        int a, b, n;
        a = in.nextInt();
        b = in.nextInt();
        n = in.nextInt();
        System.out.println(fn(a,b,n));
    }
    
    static String fn(int A, int B, int N) {
    	BigInteger[] f = new BigInteger[N];
    	f[0] = BigInteger.valueOf(A);
    	f[1] = BigInteger.valueOf(B);
    	for (int i = 2; i < N; i++) {
    		f[i] = f[i-1].multiply(f[i - 1]);
    		f[i] = f[i].add(f[i-2]);
    	}
    	return f[N-1].toString();
    }
}