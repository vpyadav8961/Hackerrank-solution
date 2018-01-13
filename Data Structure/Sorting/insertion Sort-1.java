//Link for this problem:: https://www.hackerrank.com/challenges/insertionsort1/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void insertionSort1(int n, int[] arr) {
        // Complete this function
        int last = arr[arr.length-1];
        int i = arr.length-2;
        while (i + 1 > 0 && last <= arr[i]){
            arr[i+1] = arr[i--];
            printArray(arr);
        }
        arr[i+1] = last;
        printArray(arr);
            
    }
    static void printArray(int[] arr){
        for(int n: arr){
            System.out.print(n+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        insertionSort1(n, arr);
        /*for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }*/
        in.close();
    }
}
