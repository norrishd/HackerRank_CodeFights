package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HashTables_RansomNote {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }

        HashMap<String, Integer> mappy = new HashMap<>();

        // Build map
        for (String word : magazine) {
            if (!mappy.containsKey(word)) {
                mappy.put(word, 1);
            } else {
                mappy.put(word, mappy.get(word) + 1);
            }
        }

        // Check if message passes
        boolean failed_yet = false;
        for (String word : ransom) {
            if (!mappy.containsKey(word) || mappy.get(word) == 0) {
                System.out.println("No");
                failed_yet = true;
                break;
            } else {
                mappy.put(word, mappy.get(word) - 1);
            }
        }
        if (!failed_yet)
            System.out.println("Yes");
    }
}
