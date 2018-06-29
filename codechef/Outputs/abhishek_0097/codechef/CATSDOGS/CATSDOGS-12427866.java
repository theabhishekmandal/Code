import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    	int t;
	      t=Integer.parseInt(br.readLine());
	      while(t--!=0)
	      {
	        long c,d,l;
	        int k=0;
	        String s=br.readLine();
	        String[] input;
	        input=s.split(" ");
	        c=Long.parseLong(input[0]);
	        d=Long.parseLong(input[1]);
	        l=Long.parseLong(input[2]);
	        long j=(c%2);
	        long m=(c/2);
	        if(j+m<=d)
	        	j=0;
	        else
	        	j=1;
	        for(long i=d+j;i<=c+d;i++)
	        {
	          if(i*4==l)
	          {
	            k=1;
	            break;
	          }
	        }
	        if(k==1)
	        	System.out.println("yes");
	        else
	        	System.out.println("no");
	      }
	}

}