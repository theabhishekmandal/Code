import java.util.*;
import static java.lang.System.*;
public class pandey{
	static int equalpaircount = 1;
	static class pair implements Comparable<pair>{
		int first;
		int second;
		int diff;
		pair(int one, int two){
			first = one;
			second = two;
			diff = two - one;
		}
		public int compareTo(pair p){
			return this.diff - p.diff;
		}
		public String toString(){
			return (first + " " + second);
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < arr.length; i++) arr[i] = s.nextInt();
		Arrays.sort(arr);
		pair[] blah = new pair[n - 1];
		for(int i = 0; i < arr.length - 1; i++){
			blah[i] = new pair(arr[i], arr[i + 1]);
		}
		Arrays.sort(blah);
		out.println(blah[0]);
		for(int i = 1; i < blah.length; i++){
			if(blah[i].diff == blah[i - 1].diff){
				out.println(blah[i]);
			}
			else break;
		}
	}
}