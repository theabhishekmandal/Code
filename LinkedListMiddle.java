import java.util.*;
import static java.lang.System.*;
public class LinkedListMiddle{
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	static Node root;
	static int numberofelements = 0;
	private static void append(int data){
		if(root == null){
			root = new Node(data);
			numberofelements++;
		}
		else{
			Node temp = root;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = new Node(data);
			numberofelements++;
		}
	}
	public static void middlelement(){
		if(root == null){
			err.println("NO MIDDLE ELEMENT");
			return;
		}
		Node temp = root;
		int middle = numberofelements / 2;
		while(middle-- >  0){
			temp = temp.next;
		}
		out.println(temp.data);
	}
	@Override
	public String toString(){
		Node temp = root;
		StringBuilder br = new StringBuilder();
		while(temp != null){
			br.append(temp.data).append(' ');
			temp = temp.next;
		}
		br.append('\n');
		return br.toString();
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(in);
		int n = s.nextInt();
		while(n-- > 0) append(s.nextInt());
		out.println(root.toString());
		middlelement();
	}
}