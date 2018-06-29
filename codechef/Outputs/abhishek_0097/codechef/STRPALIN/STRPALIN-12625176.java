import java.io.*;
public class Main
{
  public static void main(String args[]) throws IOException
  {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  int n=Integer.parseInt(br.readLine());
  while(n-->0)
  {
  String s1=br.readLine();
  String s2=br.readLine();
  int len=s1.length();
  int i,j,flag=0;
  for(i=0;i<len;i++)
  {
    for(j=0;j<s2.length();j++)
    {
      if(s1.charAt(i)==s2.charAt(j))
      {
        flag=1;
        break;
      }
    }
    if(flag==1)
    break;
  }
  if(flag==1)
   System.out.println("Yes");
   else
   System.out.println("No");
 }
  }
}