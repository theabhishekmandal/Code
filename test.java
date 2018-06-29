import java.util.*;
public class test{
	public static boolean foo(String hel){
		Stack<Character>  arr = new Stack<>();
		for(int i = 0 ; i < hel.length(); i++){
			String ok = "" + hel.charAt(i);
			if("{([".contains(ok)){
				arr.push(ok.charAt(0));
			} 
			else if("]})".contains(ok)){
				if(!arr.isEmpty() && Math.abs(ok.charAt(0) - arr.peek()) <= 2) arr.pop();
				else return false;
			}
		}
		if(arr.isEmpty()) return true;
		return false;
	}
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
     		String hel = s.next();
     		System.out.println((foo(hel)) ? "YES" : "NO");
		}
		
	}
}