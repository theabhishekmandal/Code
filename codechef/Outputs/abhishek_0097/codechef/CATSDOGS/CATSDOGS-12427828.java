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
	        int c,d,l;
	        int k=0;
	        String s=br.readLine();
	        String[] input;
	        input=s.split(" ");
	        c=Integer.parseInt(input[0]);
	        d=Integer.parseInt(input[1]);
	        l=Integer.parseInt(input[2]);
	        int j=(c%2);
	        int m=(c/2);
	        if(j+m<=d)
	        	j=0;
	        else
	        	j=1;
	        for(int i=c+d;i>=(d+j);i--)
	        {
	          if(i*4==l)
	          {
	            k=1;
	          }
	        }
	        if(k==1)
	        	System.out.println("yes");
	        else
	        	System.out.println("no");
	      }
	}

}