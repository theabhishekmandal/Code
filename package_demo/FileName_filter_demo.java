import java.io.*;
public class FileName_filter_demo 
{
	
	public static void main(String args[])
	{
		String s="C:\\Users\\Administrator\\Desktop\\python";
        File ob=new File(s);
        if(ob.isDirectory())
        {
        	FilenameFilter ob1=new FilenameFilter(){
        		public boolean accept(File dir,String hello)
        		{
        			return hello.endsWith(".py");

        		}
        	};
        	String[] arr=ob.list(ob1);
        	for(int i=0;i<arr.length;i++)
        	{
        		System.out.println(arr[i]);
        	}

        }
        else
        	System.out.print("working on directories only and nothing else");
	}
}




