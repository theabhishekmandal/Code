import java.util.*;
import static java.lang.System.*;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
class LinkedList{
	private Node head;
	public void append(int data){
		if(head == null){
			head = new Node(data); 
		}
		else{
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = new Node(data);
		}
	}
	public void show(){
		Node temp = head;
		while(temp != null){
			out.println(temp.data);
			temp = temp.next;
		}
	}
	public void addCycle(){
		Node temp = head;
		while(temp.next != null) temp = temp.next;
		temp.next = head;
	}
	public boolean detectcycle(){
		if(head == null) return false;
		if(head.next == null) return false;
		Node first = head;
		Node second = first.next;
		while(first != second){
				first = first.next;
				second = second.next;
				if(second == null) return false;
				second = second.next;
			}
		return true;
	}
}
public class Main
{
	public static void main(String args[])
	{
		LinkedList ob = new LinkedList();
		ob.append(10);
		ob.append(20);
	//	ob.append(30);
	//	ob.show();
		ob.addCycle();
		System.out.println(ob.detectcycle());
	}
}