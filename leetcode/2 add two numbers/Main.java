import java.util.*;
import java.io.*;
import java.math.*;
import java.util.regex.*;
import static java.lang.System.*;
public class Main{

    static long start, stop, mod = (long) 1e9 + 7L;
    static void debug(Object... a){
        err.println(Arrays.deepToString(a));
    }
    static void starttime(){start = currentTimeMillis();}
    static void stoptime(){stop = currentTimeMillis();}
    static void gettime(){err.println(((double)(stop - start) / 1000.0) + " seconds");}

    static class FastReader{
        StringTokenizer st;
        BufferedReader br;
        FastReader(){
            br = new BufferedReader(new InputStreamReader(in));
        }
        String n(){
            while(st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int ni(){
            return Integer.parseInt(n());
        }
        float nf(){
            return Float.parseFloat(n());
        }

        double nd(){
            return Double.parseDouble(n());
        }
        long nl(){
            return Long.parseLong(n());
        }
        String ns(){
            String k="";
            try{
                k = br.readLine();
            }
            catch(Exception e){

                e.printStackTrace();
            }
            return k;

        }
    }
    static class pair<First, Second>{
		First first;
		Second second;
		pair(First first,Second second){
			this.first = first;
			this.second = second;
		}
		public First getFirst(){
			return this.first;
		}
		public Second getSecond(){
			return this.second;
		}
		@Override
		public String toString(){
			return (first + " " + second);
		}
		@Override
		public boolean equals(Object o){
			if(this == o)
				return true;
			if(o == null || getClass() != o.getClass())
				return false;
			pair<?,?> pair = (pair<?, ?>) o;
			if(!first.equals(pair.first)) return false;
			return second.equals(pair.second);
		}
		@Override
		public int hashCode(){
			return 31 * first.hashCode() + second.hashCode();
		}
	}
    
    public static void main(String args[]) throws IOException{
        FastReader in = new FastReader();
        	starttime();
            solve(in);
            stoptime();
            //gettime();
    }
    static class Node{
        int data;
        Node next;
        Node temp;
        int length;
        void add(int data){
            if(temp == null){
                temp = this;
                this.data = data;
            }
            else{
                temp.next = new Node();
                temp.next.data = data;
                temp = temp.next;
            }
            length++;
        }
        void display(){
            Node temp = this;
            while(temp != null){
                out.print(temp.data + " ");
                temp = temp.next;
            }
            out.println();
        }    
    }
    static Node addTwoNumbers(Node first, Node second){
        Node temp = new Node();
        int sum = 0;
        int carry = 0;
        while(first != null || second != null){
            if(first != null){
                carry += first.data;
                first = first.next;
            }
            if(second != null){
                carry += second.data;
                second = second.next;
            }
            temp.add(carry % 10);
            carry /= 10;
            if(first == null && second == null) break;
        }
        if(carry > 0) temp.add(carry);
        return temp;
    }
    static void solve(FastReader in){
        Node first = new Node();
        first.add(9);
        first.add(9);
        first.display();
        Node second = new Node();
        second.add(9);
        second.display();
        addTwoNumbers(first, second).display();
    }
}
