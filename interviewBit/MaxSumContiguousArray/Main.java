import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++) arr[i] = s.nextInt();
        int max = arr[0];
        int currMax = arr[0];
        for(int i = 0; i < arr.length; i++){
            currMax = Math.max(arr[i], arr[i] + currMax);
            max = Math.max(max, currMax);
        }
        System.out.println(max);
    }
}