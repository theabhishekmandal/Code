import java.util.concurrent.ThreadLocalRandom;
public class RandomNumberGenerator{
	public static void main(String args[]){
		int min = Integer.parseInt(args[0]);
		int max = Integer.parseInt(args[1]);
		int range = Integer.parseInt(args[2]);
		System.out.println(range);
		for(int i = 0; i < range; i++)
			System.out.print(ThreadLocalRandom.current().nextInt(min, max + 1) + " ");
	}
}