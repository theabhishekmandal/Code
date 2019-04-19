import java.util.*;
class findingpeak
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
				arr[i][j]=s.nextInt();
		}
		int low=0;
		int high=m;
		int mid=low+(high-low)/2;
		while(low<=high)
		{
			int max=0;
			int index=0;
			for(int i=0;i<n;i++)
			{
				if(arr[i][mid]>max)
				{
					max=arr[i][mid];
					index=i;
				}
			}
			if(mid-1!=-1&&arr[index][mid]<arr[index][mid-1])
				high=mid-1;
		    else if(mid+1!=m&&arr[index][mid]<arr[index][mid+1])
		    	low=mid+1;
		    else
		    {
		    	System.out.println(arr[index][mid]);
		    	break;
		    }
		    mid=low+(high-low)/2;

		}
		

	}
}