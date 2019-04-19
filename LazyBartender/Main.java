import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int n=s.nextInt();   //number of cocktails available
            int c=s.nextInt();   //number of customers
            int save[][]=new int[c+1][n+1];
            int count[]=new int[n+1];
            for(int i=1;i<=c;i++)
            {
                int temp=s.nextInt();    //number of  coctails the  customer likes  
                for(int j=1;j<=temp;j++)
                {
                    /*
                    This k shows that the cocktail number that the current 
                    person likes
                    */
                    int k=s.nextInt();
                    /*
                    This count array stores the count of each cocktail 
                    number
                    */  
                    count[k]++;
                    /*
                    we save the cocktail number in the matrix
                    */
                    save[i][k]=k;
                }
            }
            System.out.println(solve(save,n,c,count));
        }
     }
        private static int solve(int[][] arr,int n,int c,int[] count)
        {
                        
            for(int j=2;j<=n;j++)
            {
                for(int i=1;i<=c;i++)
                {
                    int prev=arr[i][j-1];
                    int current=arr[i][j];
                    /**
                    copy the previous value of the matrix in current value
                    (if the previous is not zero and count of the previous 
                    is more than the count of the current)
                    (we use this condition because there can be a conditon where both values are present in the current and previous, 
                     so to differentiate them we use uniqueness)
                    or 
                    (if the current is zero)(we use this conditon if previous may be zero and the current is definetly zero)
                                         
                    */
                    if((prev!=0&&count[current]<count[prev])||(current==0))
                            arr[i][j]=prev;
                        
                }
            }
            /**
            creating set to find the unique values
            */
            Set<Integer> one=new HashSet<>();
            for(int i=1;i<=c;i++)
                {
                    if(!one.contains(arr[i][n]))
                    {
                        one.add(arr[i][n]);
                    }
                }
            System.out.println(Arrays.toString(one.toArray())); 
            return one.size();
        }
 }   


