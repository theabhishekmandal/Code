class A
{
    private int x;
    void hell()
    {
        int hello=300;
        class B
        {
            private int y;
            void display()
            {
                System.out.println("this is outer class object"+x);
                System.out.println("this is inner class object"+y);
                //you can access the local variable of the method from the inner class
                System.out.println("this is the local variable of the method"+hello);

            }
        }
        new B().display();
    }
}
public class Outer1 {
    public static void main(String args[])
    {
        new A().hell();
    }
}
