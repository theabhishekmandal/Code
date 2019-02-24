import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String args[]) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out= new PrintWriter(System.out);
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int n=Integer.parseInt(br.readLine());
            int a[]=new int[200];
            int carry=0;
            int digits=1;
            a[0]=1;
            for(int i=2;i<=n;i++)
            {
                for(int j=0;j<digits;j++)
                {
                    int temp=a[j]*i+carry;
                    a[j]=temp%10;
                    carry=temp/10;
                }
                while(carry>0)
                {
                    a[digits++]=carry%10;
                    carry/=10;
                }
            }
           int i=digits-1;
           while(i>=0&&a[i]==0)i--;
           for(int j=i;j>=0;j--)
            out.print(a[j]);
           out.println();


        }
        out.flush();

    }

}