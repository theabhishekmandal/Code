import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
			int n = s.nextInt();
			int m = s.nextInt();
			System.out.println((n - 1) * (m - 1));
		} 
	}
}