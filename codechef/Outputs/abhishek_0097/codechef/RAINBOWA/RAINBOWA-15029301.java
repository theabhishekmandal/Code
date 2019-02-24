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
            int k=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a[]=new int[k];
            for(int i=0;i<k;i++)
                a[i] = Integer.parseInt(st.nextToken());
            boolean check=true;
            if(a[a.length/2]==7)
            {
                int start=0;
                int last=a.length-1;
                while(start<=last)
                {
                    if(a[last]!=a[start])
                    {
                        check=false;
                        break;
                    }
                    start++;
                    last--;
                }
                if(check)
                    out.println("yes");
                else
                    out.println("no");

            }
            else
                out.println("no");

        }
        out.flush();
    }

}