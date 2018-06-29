import java.util.*;
import static java.lang.System.*;
public class SegmentTree{
	private static int[] st;
	SegmentTree(int arr[]){
		int x = (int)Math.ceil(Math.log(arr.length - 1) / Math.log(2));
		int maxsize = 2 * (int)Math.pow(2, x) - 1;
		st = new int[maxsize];
		createTree(arr, 0, arr.length - 1, 0);
	}
	private int getmid(int one, int two){
		return one + (two - one) / 2;
	}
	private int createTree(int[] arr, int arraystart, int arrayend, int segindex){
		if(arraystart == arrayend){
			st[segindex] = arr[arraystart];
			return st[segindex];
		}
		int mid = getmid(arraystart, arrayend);
		return	st[segindex] = createTree(arr, arraystart, mid, 2 * segindex + 1) + createTree(arr, mid + 1, arrayend, 2 * segindex + 2);
	}
	private int getsumutils(int segstart, int segend, int arraystart, int arrayend, int segindex){
		if(segstart >= arraystart && segend <= arrayend)
			return st[segindex];
		if(segstart > arrayend || segend < arraystart)
			return 0;
		int mid = getmid(segstart, segend);
		return getsumutils(segstart, mid, arraystart, arrayend, 2 * segindex + 1) + getsumutils(mid + 1, segend, arraystart, arrayend, 2 * segindex + 2);
	}
	private int getsum(int[] arr, int arraystart, int arrayend){
		if(arraystart < 0 || arrayend > arr.length - 1 || arrayend < arraystart){
			err.println("index out of bounds");
			return -1;
		}
		return getsumutils(0, arr.length - 1, arraystart, arrayend, 0);
	}
	private void updateutils(int segstart, int segend, int arrayindex, int diff, int segindex){
    	if(arrayindex > segend || arrayindex < segstart) return;
    	st[segindex] += diff;
    	if(segstart != segend){
    		int mid = getmid(segstart, segend);
    		updateutils(segstart, mid, arrayindex, diff, 2 * segindex + 1);
    		updateutils(mid + 1, segend, arrayindex, diff, 2 * segindex + 2);
    	}
	}
	private void update(int[] arr, int index, int val){
		if(index < 0 ||  index > arr.length - 1){
			err.println("index out of bounds");
			return;
		}
		int diff = val - arr[index];
		arr[index] = val;
		updateutils(0, arr.length - 1, index, diff, 0);
	}
	@Override
	public String toString(){
		return Arrays.toString(st);
	}
	public static void main(String args[]){
	    int arr[] = {1, 3, 5, 7 , 9, 11};
        SegmentTree ob = new SegmentTree(arr);
        out.println(ob);
        out.println(ob.getsum(arr, 0 , 1));
        ob.update(arr, 0, 14);
        out.println(Arrays.toString(arr));
        out.println(ob);
	}
}                               