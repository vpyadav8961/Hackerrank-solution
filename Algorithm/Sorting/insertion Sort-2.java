//Link for this problem:: https://www.hackerrank.com/challenges/insertionsort2/problem
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    // Sorting
    static void insertionSort2(int n, int[] a) {
        // Complete this function
            int k,i,j,t;
            for(i=1;i<n;i++){
                k=a[i];
                j=i-1;
                while(j>=0 && a[j]>k){
                    a[j+1] = a[j];
                    j = j-1;
                    a[j+1] = k;
                }
                printArray(a);
            }
    }
    //method for print
    static void printArray(int[] a){
        for(int n: a){
            System.out.print(n+" ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        insertionSort2(n, arr);
        in.close();
    }
}
