import java.util.*;
import static java.lang.System.*;
public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(in);
        int t = s.nextInt();
        while(t-- > 0){
            int n = s.nextInt();
            int m = s.nextInt();
            int arr[] = new int[n];
            int counter = 0;
            for(int i = 0; i < arr.length; i++) {
            	int temp = s.nextInt();
            	if(temp % m == 0) counter++;
            }
            out.println(counter);
        }
    }
}

9476014258	