import java.util.concurrent.ThreadLocalRandom;
public class input{
	public static void main(String[] args) {
		int min = -1000000;
		int max = 1000000;
		System.out.println(1000 + " " + 1000);
		for(int i = 0; i < 1000; i++){
			for(int j = 0; j < 1000; j++){
				int random = ThreadLocalRandom.current().nextInt(min, max + 1);
				System.out.print(random + " ");
			}
			System.out.println();
		}
	}
}