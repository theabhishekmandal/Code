import java.util.*;
import static java.lang.System.*;
public class Main{
	private static int gcd(int a, int b){
		return (b == 0)? a : gcd(b, a % b);
	}
	public static void main(String args[]){
		Scanner s = new Scanner(in);
		int t = s.nextInt();
		while(t-- > 0){
			int n = s.nextInt();
         	int arr[] = new int[n];
         	int res = s.nextInt();
         	arr[0] = res;
         	boolean check = false;
         	for(int i = 1; i < arr.length; i++){
         		arr[i] = s.nextInt();
         		res = gcd(res, arr[i]);                                                 
         	}
         	if(res == 1) out.println(0);
         	else out.println(-1);
		}
	}
}