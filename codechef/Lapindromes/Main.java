import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
			String one = s.next();
			int mid = one.length() / 2;
			boolean even = (one.length() % 2 == 0)? true : false;
			int arr[] = new int[26];
			for(int i = 0; i < mid; i++) arr[one.charAt(i) - 'a']++;
			int start = (even) ? 0 : 1;
			for(int i = mid + start; i < one.length(); i++) arr[one.charAt(i) - 'a']--;
			System.out.println(getAnswer(arr));
		}
	}
	public static String getAnswer(int[] arr){
		for(int i = 0; i < arr.length; i++){
				if(arr[i] != 0)
					return "NO";
			}
		return "YES";
	}
}