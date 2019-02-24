import java.util.*;
import java.lang.*;
import java.io.*;
 

class Codechef
{   
	public static void main (String[] args) throws java.lang.Exception
	{    
	    Scanner sc1 = new Scanner(System.in);
	    int tc = sc1.nextInt();
	    int ch=0;
	    while(ch<tc){
	        int n = sc1.nextInt();
	        int k = sc1.nextInt();
	        long[] a = new long[n];
	        long[] d = new long[n];
	        HashMap<Long,Long> freq = new HashMap<>();
	        for(int i=0;i<n;i++){
	            a[i]=sc1.nextLong();
	        }
	        long c=0;
	        for(int i=0;i<n;i++){
	            d[i]=sc1.nextLong();
	            c+=d[i];
	            if(freq.containsKey(a[i])){
	                long f = freq.get(a[i]);
	                f += d[i];
	                freq.put(a[i],f);
	            }
	            else{
	                freq.put(a[i],d[i]);
	            }
	        }
	        long[] nums = new long[n];
	        int lims=0;
	        HashMap<Long,Integer> present = new HashMap<>();
	        for(int i=0;i<n;i++){
	            if(!present.containsKey(a[i])){
	                nums[lims]=a[i];
	                lims++;
	                present.put(a[i],1);
	            }
	        }
	        long[] b = new long[k];
	        long sum1=0;
	        long dup = c;
	        for(int i=0;i<k;i++){
	            b[i]=sc1.nextLong();
	            b[i]= dup-b[i];
	            dup -= b[i];
	        }
	        Arrays.sort(nums);
	        int chef=0;
	        for(int i=0;i<n;i++){
	            if(nums[i]!=0){
	                chef=i;
	                break;
	            }
	        }
	        int sec=n-1;
	        int chance=0;
	        //System.out.println(Arrays.toString(nums));
	        //System.out.println(Arrays.toString(b));
	        while(chef<sec&&chance<k){
                
	            if(chance%2==0){
	                int j=chef;
	                while(j<=sec){
	                    long f = freq.get(nums[j]);
	                    if(f<b[chance]){
	                        b[chance] -= f;
	                        c-=f;
	                        f=0;
	                        freq.put(nums[j],(long)0);
	                        j++;
	                    }
	                    else{
	                        f -= b[chance];
	                        c-=b[chance];
	                        b[chance]=0;
	                        freq.put(nums[j],f);
	                    }
	                    if(b[chance]==0){
	                        break;
	                    }
	                }
	                chef=j;
	                //System.out.println(chance+" "+chef+" "+c);
	            }
	            else{
	                int j = sec;
	                while(j>=chef){
	                    long f = freq.get(nums[j]);
	                    if(f<b[chance]){
	                        b[chance] -= f;
	                        c-=f;
	                        f=0;
	                        freq.put(nums[j],(long)0);
	                        j--;
	                       // System.out.println(j+" "+f+" "+b[chance]+" "+c);
	                    }
	                    else{
	                        f -= b[chance];
	                        c -= b[chance];
	                        b[chance]=0;
	                        freq.put(nums[j],f);
	                        //System.out.println(chance+" "+chef+" "+j);
	                    }
	                    if(b[chance]==0){
	                        break;
	                    }
	                }
	                sec=j;
	            }
	            //System.out.println("main: "+chance+" "+chef+" "+sec);
	            chance++;
	        }
	        //System.out.println(chef +" "+sec);
	        //System.out.println(freq.get(nums[chef]) +" "+freq.get(nums[sec]));
	        long sum=0;
	        for(int i=chef;i<=sec;i++){
	            sum+=nums[i]*freq.get(nums[i]);
	        }
	        System.out.println(sum);
	        ch++;
	    }
	}
}
 