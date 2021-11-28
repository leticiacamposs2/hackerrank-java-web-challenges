import java.math.BigInteger;  
import java.util.*; 

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        BigInteger N = scan.nextBigInteger();
        BigInteger Y = scan.nextBigInteger();
        
        BigInteger sum = N.add(Y);  
        BigInteger ans = N.multiply(Y);  

        System.out.println(sum);
        System.out.println(ans);

        scan.close();
    }
}