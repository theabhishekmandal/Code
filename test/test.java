import java.util.*;
public class test{
	static class Date implements Comparable<Date>{
		int d;
		int m;
		int y;
		Date(int d, int m, int y){
			this.d = d;
			this.m = m;
			this.y = y;
		}
		public int compareTo(Date ob){
			if(this.y == ob.y){
				if(this.m == ob.m){
				 	return this.d - ob.d;
				}
				return this.m - ob.m;
			}
			return this.y - ob.y;
		}
	}
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.nextLine();
		String hel[] = new String[n];
		for(int i = 0; i < hel.length; i++){
			hel[i] = s.nextLine();
		}
		Date[] d = new Date[hel.length];
		for(int i = 0; i < d.length; i++){
			String save[] = hel[i].split(" ");
			d[i] = new Date(Integer.parseInt(save[0]), Integer.parseInt(save[1]), Integer.parseInt(save[2]));
		}
		Arrays.sort(d);
		for(int i = 0; i < d.length; i++){
			System.out.println(d[i].d + " " + d[i].m + " " + d[i].y);
		}
	}
}