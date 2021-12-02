import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        try {
            int N = scan.nextInt();
            int Y = scan.nextInt();
            System.out.println(N/Y);
        
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        scan.close();
    }
}