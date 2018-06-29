import java.util.*;
import static java.lang.System.*;
public class Main{
    static class Trie{
        boolean isWord;
        Trie[] children = new Trie[26];
        Trie(){
            this.isWord = false;
            Arrays.fill(children, null);
        }
    }
    static Trie root;
    static void insert(String hel){
        // root not to be changed
        Trie temp = root;
        for(int i = 0; i < hel.length(); i++){
            int index = hel.charAt(i) - 'a';
            if(temp.children[index] == null)
                temp.children[index] = new Trie();
            temp = temp.children[index];
        }
        temp.isWord = true;
    }
    static boolean search(String arr){
        Trie temp = root;
        for(int i = 0; i < arr.length(); i++){
            int index = arr.charAt(i) - 'a';
            if(temp.children[index] == null){
                if(!temp.isWord) return false;
                else if(temp.isWord){
                    if(root.children[index] != null){
                        temp = root;
                        i--;
                        continue;
                    }
                    else return false;
                }
            }
            temp = temp.children[index];
        }
        return (temp != null && temp.isWord);
    }
    public static void main(String args[]){
    	Scanner s = new Scanner(in);
        root = new Trie();
        out.println("enter the words of the dictionary seperated by space");
        String[] dict = s.nextLine().split(" ");
        for(int i = 0; i < dict.length; i++) insert(dict[i]);
        out.println("enter the concatenated word to be searched");
    	String word = s.next();

       // search("iloveindianfood");
        out.println(search(word));
    }
}