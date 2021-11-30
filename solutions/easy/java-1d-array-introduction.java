import java.util.*;

public class Solution {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        
        int[] myArray = new int[n];

        for (int i = 0; i < n; i++) {
            myArray[i] = scan.nextInt();
        }

        scan.close();

        for (int i = 0; i < n; i++) {
            System.out.println(myArray[i]);
        }
    }
}