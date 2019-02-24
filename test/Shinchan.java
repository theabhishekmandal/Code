import java.util.*;
public class Shinchan{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int arr[] = new int[n];
		int diff[] = new int[n - 1];
		for(int i = 0; i < arr.length; i++){
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr);
		D[] val = new D[n - 1];
		for(int i = 0; i < diff.length; i++){
			diff[i] = arr[i + 1] - arr[i];
			val[i] = new D(diff[i], i);
		}
		Arrays.sort(val);
		int cal = 0;
		m--;
		int large = arr[val[m - 1].index + 1];
		for(int i = 0; i < m; i++){
			cal += large - arr[val[i].index];
		}
		System.out.println(cal);

	}
	static class D implements Comparable<D>{
		int diff;
		int index;
		D(int a, int b){
			diff = a;
			index = b;
		}
		public int compareTo(D d){
			return this.diff - d.diff;
		}
	}
}