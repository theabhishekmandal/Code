import java.util.*;
public class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int arr[]=new int[t];
		for(int i=0;i<arr.length;i++)
			arr[i]=s.nextInt();
		System.out.println(Arrays.deepToString(getoutput(arr)));	
	}

	private static String[][] getoutput(int[] arr)
    {
        String[][] one=new String[arr.length][arr.length];


        for(int i=one.length-1;i>=0;i--)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]>0)
                {
                    one[i][j]="*";
                    arr[j]-=1;
                }
                else
                {
                    one[i][j]=" ";
                }
            }
        }
        return one;
    }
}