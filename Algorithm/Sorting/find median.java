//Link for this problem:: https://www.hackerrank.com/challenges/find-the-median/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int findMedian(int[] arr) {
        // Complete this function
         int median;
        Arrays.sort(arr);
        if(arr.length % 2 == 0){
            int mid = (arr.length / 2);
            median = (arr[mid] + arr[mid - 1]) / 2;
        }
        else{
            median = arr[arr.length / 2];
        }
        return median;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = findMedian(arr);
        System.out.println(result);
        in.close();
    }
}
