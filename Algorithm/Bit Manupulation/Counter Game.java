//Link for this problem:: https://www.hackerrank.com/challenges/counter-game/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String counterGame(long n) {
        // Complete this function
    
        return (Long.bitCount(n - 1) - 1 & 1) == 0 ? "Louise" : "Richard";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            String result = counterGame(n);
            System.out.println(result);
        }
        in.close();
    }
}
