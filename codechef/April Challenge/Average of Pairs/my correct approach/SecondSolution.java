import java.util.*;
public class SecondSolution{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
			int n = s.nextInt();
			long fre[] = new long[2001];
			long count = 0L;
			for(int i = 0; i < n; i++){                               
				int temp = s.nextInt();
				/*	
					counting the frequency of each unique element
					adding 1000 to make the negative numbers positive and 1000 because it is the max value of the array element 
				*/                                    
            	fre[temp + 1000]++; 
			                                                                                   
			}
			for(int i = 0;i < fre.length; i++){
				if(fre[i] == 0) continue;
				/*
					first calculating the number of pairs if both the 
					elements are same.
				*/
				count += 1L * fre[i] * (fre[i] - 1) / 2 ;
				for(int j = 1; i - j >= 0 && i + j < fre.length; j++){
					/*
						if a number is an average of two numbers then the 
						two numbers must lie at a equidistant from the 
						average. here we don't divide by two because we 
						are not getting duplicates
					*/
					count += 1L * fre[i - j] * fre[i + j];
				}	
			}
			System.out.println(count);
		}
	}
}