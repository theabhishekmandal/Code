import java.util.concurrent.ThreadLocalRandom;
import java.util.*;
public class RandomNumberGenerator{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String string = s.nextLine();
		System.out.println(string.matches("^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"+ "A-Z]{2,7}$"));
	}
}