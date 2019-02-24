import java.util.*;
import static java.lang.System.*;

public class Solution{
    public static void main(String args[]){
		
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int k = s.nextInt();
	int arr[] = new int[n];
	for(int i = 0; i <  arr.length; i++){
		arr[i] = s.nextInt();
	}

	for(int i = 0 ; i < k; i++){
		int temp = arr[0];
		for(int j = 1; j < arr.length; j++){
			arr[j - 1] = arr[j];
		}
		arr[arr.length - 1] = temp; 
	}

	for(int i = 0; i < arr.length; i++){
		if(i != arr.length - 1)
			out.print(arr[i] + " ");
		else
			out.print(arr[i]);
	}
	    	
    }
}