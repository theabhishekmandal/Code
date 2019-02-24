import java.util.*;
import java.io.*;
import java.math.*;
import java.util.regex.*;
import static java.lang.System.*;
public class Main{

public static void main(String[] args) {
    Scanner s = new Scanner(in);
    int n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        numbers []number = new numbers[arr.length - 1];
        for(int i = 0; i < arr.length - 1; i++){
            int temp = arr[i + 1] - arr[i];
            number[i] = new numbers(arr[i + 1], arr[i], temp);            
        }
        Arrays.sort(number);
        for(int i = 0; i < number.length - 1; i++){
            if(number[i].differ == number[i + 1].differ){
                out.println(number[i].one + " " + number[i].two);
                if(i == number.length - 2)
                    out.println(number[i + 1].one + " " + number[i + 1].two);
            }
            else if(number[i].differ < number[i + 1].differ){
                out.println(number[i].one + " " + number[i].two);
            }
            }

}
    static class numbers implements Comparable<numbers>{
        int one;
        int two;
        int differ;
        numbers(int one,int two,int differ){
            this.one = one;
            this.two = two;
            this.differ = differ;
        }
        public int compareTo(numbers num){
            return this.differ - num.differ;
        }
    }
             
}    
 
