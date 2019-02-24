import java.util.*;
import static java.lang.System.*;
abstract class hello
{
    void sayhi()
    {
        out.println("hello everyone");
    }
    abstract class helloinside
    {
        void hiagain()
        {
            out.println("hey i am here again");
        }
    }
}
public class Main
{
    public static void main(String[] args) {
        hello one = new hello(){};
        one.sayhi();
        hello.helloinside arr = new hello(){}.new helloinside(){};
        arr.hiagain();
    }
}