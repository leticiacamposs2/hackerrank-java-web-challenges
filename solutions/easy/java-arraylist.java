import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 0;

        for (i = 0; i < n; i++) {           
            int d = scan.nextInt();
            ArrayList<Integer> newArray = new ArrayList<Integer>();
            
            for (i = 0; i < d; i++) {
                newArray.add(scan.nextInt());   
            }
            arr.add(newArray);            
        }
        
        int q = scan.nextInt();

        for (i = 0; i<q ; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            
            try {
                System.out.println(arr.get(x-1).get(y-1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}