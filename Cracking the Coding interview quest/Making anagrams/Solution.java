import java.util.*;
import static java.lang.System.*;

public class Solution{
	public static void main(String args[]){

		Scanner s = new Scanner(System.in);
		String one = s.next();
		String two = s.next();
		String large = (one.length() >= two.length())? one : two;
		String small = (one.length() < two.length())? one : two;

		int hel[] = new int[26];
		for(int i = 0 ; i < large.length(); i++){
			hel[large.charAt(i) - 'a']++;
		}
		for(int j = 0; j < small.length(); j++){
			hel[small.charAt(j) - 'a']--;
		}
		int count = 0;
		for(int i = 0 ; i < hel.length; i++){
			if(hel[i] != 0)
				count += Math.abs(hel[i]);
		}
		out.println(count);
	}
}