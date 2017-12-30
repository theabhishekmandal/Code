import java.util.*;
class trie
{

  // char for storing the alphabets
	char arr[];
 //boolean to check if the word is complete
	boolean check;
 // an array of references for each index of the char array
	trie[] next;
	trie()
	{
		this.arr=new char[26];
		this.check=false;
		this.next=new trie[26];

	}
}
public class trietest
{
	trie head;
	trietest()
	{
		head=new trie();
	}

	void add(String s)
	{
        
      trie temp=head;
      for(int i=0;i<s.length();i++)
      {
      	 int index=s.charAt(i)-'a';
      	 if(temp.arr[index]!=s.charAt(i))
      	 	  temp.arr[index]=s.charAt(i);

      	 //if position for the next character is not prersent
      	 if(temp.next[index]==null&&i!=s.length()-1)
      	 		temp.next[index]=new trie();
      	
      	 	temp=temp.next[index];
      }
      temp.check=true;

	}
	void display()
	{
		trie temp=head;
		for(int i=0;i<temp.arr.length;i++)
		{
			
		}
	}

	public static void main(String args[])
	{

	}
}