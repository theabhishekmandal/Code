import java.util.*;
import static java.lang.System.*;
public class sort1and2 {
    static class node<T>{
        T data;
        node next;
        node prev;
        node(T data){
            this.data = data;
            this.next = this.prev = null;
        }
    }
    private static node<?> root;
    private static <T> void append(T data){
        if(root == null){
            root = new node<>(data);
            return;
        }
        node<?> temp = root;
        while(temp.next != null) temp = temp.next;
        node<?> temp2 = new node<>(data);
        temp.next = temp2;
        temp2.prev = temp;
    }
    public static String show(){
        StringBuilder br =  new StringBuilder();
        node temp = root;
        while(temp != null){
            br.append(temp.data).append(" ");
            temp = temp.next;
        }
        br.append("\n");
        return br.toString();
    }
    static node<?> add(node<?> foo, node<?> data){
        if(foo == null){
            foo = data;
        }
        else {
            node<?> fooend = foo;
            while(fooend.next != null) fooend = fooend.next;
            fooend.next = data;
            data.prev = fooend;
        }
        return foo;
    }
    public static void sort(){
        node<?> zero, one, two;
        zero = one = two = null;
        node<?> temp = root;
        while(temp != null){
            if(temp.data.equals("0")){
               temp = temp.next;
               node<?> blah = temp.prev;
//               blah.next = null;
//               blah.prev = null;
               temp.prev = null;
               zero = add(zero, blah);
            }
            else if(temp.data.equals("1")){
                temp = temp.next;
                node<?> blah = temp.prev;
//                blah.next = null;
//                blah.prev = null;
                temp.prev = null;
                one = add(one, blah);
            }
            else{
                temp = temp.next;
                node<?> blah = temp.prev;
//                blah.next = null;
//                blah.prev = null;
                temp.prev = null;
                two = add(two, blah);
            }
        }
        linkall(zero, one, two);
    }
    static void linkall(node<?> zero, node<?> one, node<?> two){
        root = zero;
        while(zero.next != null) zero = zero.next;
        zero.next = one;
        while(one.next != null) one = one.next;
        one.next = two;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(in);
        int n = s.nextInt();
        while(n-- > 0) append(s.next());
        out.println(show());
        sort();
        out.println(show());
    }
}



// complete the previous two diary entry  //done
// solve josh questions
// study javascript
// read cracking the coding interview
// do codechef
// study a little about ml