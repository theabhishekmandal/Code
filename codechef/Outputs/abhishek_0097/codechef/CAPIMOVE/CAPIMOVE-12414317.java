import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //your code goes here
	    Scanner s=new Scanner(System.in);
	    int t,temp;
	    t=s.nextInt();
	    while(t--!=0)
	    {
	    int n,max=0;
	    n=s.nextInt();
	    int p[]=new int[n+1];
	    for(int i=1;i<=n;i++)
	    {
	      p[i]=s.nextInt();
	    }   
	    int a[][]=new int [n+1][n+1];
	    for(int i=1;i<n;i++)
	    {
	      int v,u;
	      v=s.nextInt();
	      u=s.nextInt();
	      a[v][u]=1;
	      a[v][v]=1;
	      a[u][u]=1;
	      a[u][v]=1;
	    }
	    for(int i=1;i<=n;i++)
	    { max=0;temp=0;
	      for(int j=1;j<=n;j++)
	      {
	        if(a[i][j]!=1&&p[j]>max)
	        {
	          max=p[j];
	          temp=j;
	        }
	      }
	      System.out.print(temp+" ");
	    }
	    System.out.println();
	    }
	  
	}

}