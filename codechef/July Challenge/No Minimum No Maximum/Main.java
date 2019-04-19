import java.util.*;
import java.io.*;
import static java.lang.System.*;
class Main {
	private static int k = 2;
	private static ArrayList<String> blah, truncated; //= new ArrayList<>();
	private static HashMap<Integer, Integer> arr; //= new HashMap<>();
    public static void main(String args[]) throws Exception {
    	while(k > 0){
    		int[] one = {1, 2, 3, 4, 5, 6, 7 , 8, 9, 10};
    		arr = new HashMap<>();
            blah = new ArrayList<>();
            truncated = new ArrayList<>();
            foo(one, new int[0]);
            out.println(k);
            // out.println(arr);
            //out.println(blah);
            out.println(truncated);
            k--;
    	}  
    }
    private static String substring(int[] arr, int begin, int end){
        StringBuilder br = new StringBuilder();
        for(int i = begin; i < end; i++) br.append(Integer.toString(arr[i]));
        err.println(br.toString());
        return br.toString();        
    }
    private static void foo(int[] one, int[] two){
		if(one.length == 0){
			if(two.length == k){
                blah.add(Arrays.toString(two));
                //err.println(Arrays.toString(two));
                truncated.add(substring(two, 1, two.length - 1));
				for(int i = 0; i < two.length; i++){
					if(!arr.containsKey(two[i])){
						arr.put(two[i], 1);
					}
					else{
						arr.put(two[i], arr.get(two[i]) + 1);
					}
				}
			}
			return;
		}
		//int temp[] = new int[one.length - 1];
		//for(int i = 1; i < one.length; i++) temp[i - 1] = one[i];
		//foo(temp, two);
		foo(Arrays.copyOfRange(one, 1, one.length), two);
		int[] temp2 = Arrays.copyOf(two, two.length + 1);
		temp2[temp2.length - 1] = one[0];
		foo(Arrays.copyOfRange(one, 1, one.length), temp2);
		
	}
}