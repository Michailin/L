import java.math.BigInteger;
import java.util.ArrayList;
import  java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        BigInteger prev = new BigInteger("0");
        BigInteger prev_ = new BigInteger("0");
        BigInteger tmp = new BigInteger("0");
        for(int i = 0; i < len; i++) {
            if(i == 0)
            {
                prev = s.nextBigInteger();
                System.out.print(prev.toString() + " ");
            }
            else
            {
                prev_ = s.nextBigInteger();
                tmp = prev_.subtract(prev);
                prev = prev_;
                System.out.print(tmp.toString() + " ");
            }
        }
        s.close();
    }
}
