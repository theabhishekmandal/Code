import java.util.*;
import java.io.*;
import java.math.*;
import java.util.regex.*;
import static java.lang.System.*;
public class Main{
public static void main(String[] args) {
        Scanner s = new Scanner(in);
        int n = s.nextInt();
        String arr[] = new String[n];
        for(int i = 0; i < arr.length; i++)
            arr[i] = s.next();
        Arrays.sort(arr);
        for(String i : arr)
            out.println(i);
    }    
}
