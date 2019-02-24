import java.util.*;
import java.math.*;
public class Main
{
  public static void main(String args[ ])
  {
    int t;
    //number of  test cases
    Scanner a =new Scanner(System.in);
    t=a.nextInt();
    int j=1;
    while(j<=t)
    {
      BigInteger b=a.nextBigInteger();
      BigInteger b4=new BigInteger("33");
      
      //input
      if(b.compareTo(b4)==1)
      {
      System.out.println("Case"+" "+j+":"+" "+"8589934591");
    }
    else
    {
    	
      long d=(long)Math.pow(2,b.longValue());
      System.out.println("Case"+" "+j+":"+" "+(d-1));
    }
      j++;

    }
  }
}