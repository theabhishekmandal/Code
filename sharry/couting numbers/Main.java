import java.util.*;
import java.io.*;
import java.math.*;
import java.util.regex.*;
import static java.lang.System.*;
public class Main{
public static void main(String args[]){
		Scanner s = new Scanner(System.in);
	 String hel = s.next();
        int arr[] = new int[10];
        for(int i = 0; i < hel.length(); i++)
            arr[hel.charAt(i) - '0']++;
        for(int i = 0; i < arr.length; i++){
            out.println(i + " comes " + arr[i] + " times");
        }

}    
 }
