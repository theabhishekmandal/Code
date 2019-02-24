import java.util.*;
import java.util.regex.*;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
     int t=s.nextInt();
     while(t-->0)
     {
     String j=s.next();
     String S=s.next();
     int count=0;
     for(int i=0;i<S.length();i++)
     {
        Pattern p=Pattern.compile(String.valueOf(S.charAt(i)));
        Matcher m=p.matcher(j);
        if(m.find())
         count++;
     }
     System.out.println(count);
     }

  }
}