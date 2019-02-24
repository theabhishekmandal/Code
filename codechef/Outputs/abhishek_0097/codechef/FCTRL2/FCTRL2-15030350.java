import java.io.*;
import java.util.*;
import java.math.*;

public class Main
{
    public static void main(String args[]) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out= new PrintWriter(System.out);
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int n=Integer.parseInt(br.readLine());
            BigInteger big=new BigInteger("1");
            for(int i=2;i<=n;i++)
                big=big.multiply(new BigInteger(Integer.toString(i)));
            out.println(big);

        }
        out.flush();

    }

}