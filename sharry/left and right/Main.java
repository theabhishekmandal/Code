import java.util.*;
import java.io.*;
import java.math.*;
import java.util.regex.*;
import static java.lang.System.*;
public class Main{
public static void main(String[] args) {
    Scanner s = new Scanner(in);
    String hel = s.next();
    int check = (hel.length() % 2 == 0)? 0: 1;
 
     int left = 0;
     for(int i = 0; i < hel.length() / 2; i++){
         left += hel.charAt(i) - '0';
     }
     int right = 0;
     for(int i = hel.length() / 2 + check; i < hel.length(); i++){
         right += hel.charAt(i) - '0';
     }
     if(left == right)
         out.println("Yes");
     else
         out.println("No");      
   }   
 }
