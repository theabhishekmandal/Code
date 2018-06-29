import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < arr.length; i++) arr[i] = s.nextInt();
		System.out.println(solve(arr));	
	}
	private static int solve(int arr[]){
		int coin = 1;
		boolean coinexist = false;
		for(int i = 0; i < arr.length; i++){
			if(coin == arr[i]) {
				coinexist = true;				
				continue;
			}
			 if(coinexist){
			 	coinexist = false;
				coin++;
			}
			if(!coinexist && coin < arr[i]){
				return coin;
			}
		}
		return (coin + 1);
	}
}