import java.util.*;
import java.io.*;
import java.math.*;
import java.util.regex.*;
import static java.lang.System.*;
public class Main{
public static void main(String[] args) {
    Scanner s = new Scanner(in);
        String hel = s. next();
        int arr[] = new int[26];
        for(int i = 0; i < hel.length(); i++)
            arr[hel.charAt(i) - 'a']++;
        for(int i = 0 ; i < hel.length() - 1; i++){
            if((hel.charAt(i) != hel.charAt(i + 1)) || i == hel.length() - 2){
                out.print(Character.toString(hel.charAt(i)) + arr[hel.charAt(i) - 'a']);
            }
        }

    }    
 }
