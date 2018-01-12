import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        //taking input
        int N = in.nextInt();
        String str[] = new String[N];
        for(int i = 0;i<N;i++){
            str[i] = in.next();
        }
        int Q = in.nextInt();
        String[] qStr = new String[Q];
        for(int i = 0;i<Q;i++){
            qStr[i] = in.next();
        }
        in.close();
        //counting the number of occurence
        for(int i = 0;i<Q;i++){
            int count = 0;
            for(int j = 0;j<N;j++){
                if(qStr[i].equals(str[j]))
                    count++;
            }
            System.out.println(count);
        }
    }
}