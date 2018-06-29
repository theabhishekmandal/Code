import java.util.*;
import static java.lang.System.*;
public class Main{
	private static HashMap<Long, Long> blah;
	public static void main(String args[]){
		Scanner s = new Scanner(in);
		long n = s.nextLong();
		blah = new HashMap<>();
		out.println(foo(n));
	}
	private static long foo(long n){
		if(blah.containsKey(n)) return blah.get(n);
		if(n < (long)12) blah.put(n, n);
		else
			blah.put(n, Math.max(n, foo((long)n / 2) + foo((long)n / 4) + foo((long)n / 3)));
		return blah.get(n);
	}
}