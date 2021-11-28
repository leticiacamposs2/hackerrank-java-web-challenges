import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = "";
        String C = "";
        
        for (int i = 1; i <= A.length(); i++) {
            B = A.substring(A.length()-i);
            C += B.substring(0,1);
        }        

        if (C.equals(A)) {
            System.out.printf("Yes");
        } else {
            System.out.printf("No");
        }
        
        scan.close();
    }
}