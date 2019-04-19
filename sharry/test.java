import java.util.*;
import static java.lang.System.*;
public class test{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 2 * n + 1;
		int col = (n * (n + 1)) / 2 + n;
		int k = 0;
		int middle = (int)Math.ceil(row / 2.0);
		for(int i = 1; i <= row; i++){
			if(i == middle){
				for(int j = 1; j <= col; j++){
					out.print("*");
				}
			}
			else{  
				if(i > middle) k = row - i + 1;
				else k = i;
				int temp = k;
				int count = n - k + 1;
				for(int j = 1; j <= col; j++){
					if(temp > 0 && j == (count * (count + 1)) / 2 + count){
						temp--;
						count++;
						out.print("*");
					}
					else{
						out.print(" ");
					}
				}
			}
			out.println();
		}
	}
}