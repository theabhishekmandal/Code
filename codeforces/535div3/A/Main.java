import java.util.*;
public class Main {
    public static void debug(Object...a){
        System.err.println(Arrays.deepToString(a));
    }
	public static void main(String args[]) {
		Scanner io = new Scanner(System.in);
		int N = io.nextInt();

		Map<Integer, Integer> map = new HashMap<>();
		int first = 0;
		for (int i = 0; i < N; i++) {
			int key = io.nextInt();
			first = Math.max(first, key);
			map.put(key, map.containsKey(key) ? map.get(key) + 1 : 1);
        }
        debug(map);
		for (int i = first; i >= 1; i--) {
			if (first % i != 0)
				continue;
			if (map.get(i) == 1)
				map.remove(i);
		}

		int second = 0;
		for (int i : map.keySet())
			second = Math.max(second, i);

		System.out.printf("%d %d", first, second);
	}
}
