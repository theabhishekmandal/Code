import java.util.*;
import java.lang.*;

class Main
{
    public static int[] increment_and_copy(int a[],int carry)
    {
        int mid=a.length/2;
        int left=mid-1;
        int right=(a.length%2==0)?mid:mid+1;
        if(a.length%2==1)
        {
            a[mid]=a[mid]+carry;
            carry=a[mid]/10;
            a[mid]%=10;
        }
        while(left>=0)
        {
            a[left]=a[left]+carry;
            carry=a[left]/10;
            a[left]%=10;
            a[right]=a[left];
            left--;
            right++;
        }
        return a;
    }
    public static boolean is_left_greater_than_right(int a[])
    {
        boolean check=false;
        int mid=a.length/2;
        int left=mid-1;
        int right=(a.length%2==0)? mid:mid+1;
        while(left>=0&&a[left]==a[right])
        {
            left--;
            right++;

        }
        if(a[left]>a[right])
            check=true;

        return check;

    }
    public static boolean is_all_digits_nine(int a[])
    {
        boolean check=true;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=9)
            {
                check=false;
                break;
            }
        }
        return check;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            String k=s.next();
            int a[]=new int[k.length()];
            for(int i=0;i<k.length();i++)
                a[i]=k.charAt(i)-'0';
            if(is_all_digits_nine(a))
            {
                String hello="1";
                for(int i=1;i<a.length;i++)
                {
                    hello+="0";
                }
                hello+="1";
                System.out.println(hello);
            }
            else
            {
                if(k.equals(new StringBuilder(k).reverse().toString()))
                {
                    a=increment_and_copy(a,1);
                }
                else
                {
                    if(is_left_greater_than_right(a))
                    {
                        a=increment_and_copy(a,0);
                    }
                    else
                    {
                        a=increment_and_copy(a,1);
                    }
                }
                StringBuilder build=new StringBuilder();
                for(int i=0;i<a.length;i++)
                {
                    build.append(a[i]);
                }
                System.out.println(build);

            }
        }
    }
}