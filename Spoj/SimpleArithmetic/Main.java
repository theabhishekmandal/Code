import java.util.*;
import java.io.*;
import java.math.*;
import java.util.regex.*;
public class Main
{
    private static PrintWriter out = new PrintWriter(System.out,true);
    private static PrintWriter err = new PrintWriter(System.err,true);
    private static long start;
    private static long stop;
    private static int maxint = Integer.MAX_VALUE;
    private static int minint = Integer.MIN_VALUE;
    private static void debug(Object... a)
    {
        err.println(Arrays.deepToString(a));
    }
    private static void starttime(){start = System.currentTimeMillis();}
    private static void stoptime(){stop = System.currentTimeMillis();}
    private static void gettime(){err.println(((double)(stop - start) / 1000.0) + " seconds");}
    static class FastReader
    {
        StringTokenizer st;
        BufferedReader br;
        FastReader()
        {
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String n()
        {
            while(st==null||!st.hasMoreElements())
            {
                try
                {
                    st=new StringTokenizer(br.readLine());
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int ni()
        {
            return Integer.parseInt(n());
        }
        float nf()
        {
            return Float.parseFloat(n());
        }

        double nd()
        {
            return Double.parseDouble(n());
        }

        long nl()
        {
            return Long.parseLong(n());
        }
        String ns()
        {
            String k="";
            try
            {
                k=br.readLine();
            }
            catch(Exception e)
            {

                e.printStackTrace();
            }
            return k;

        }
    }
    public static void main(String args[]) throws IOException
    {
        FastReader in = new FastReader();
        starttime();
        int t = in.ni();
        for(int test = 1; test <= t; test++)
        {
            solve(in); //, test);
        }
        stoptime();
        gettime();

    }
    private static void solve(FastReader in)
    {
        String exper = in.ns();
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();
        StringBuilder third = new StringBuilder();
        StringBuilder firstdashes = new StringBuilder();
        StringBuilder newdashes = new StringBuilder();
        BigInteger num1 = new BigInteger("0");
        BigInteger num2 =new BigInteger("0");
        char oper = '\0';
        String[] middlevalues = new String[0];
        for(int i = 0 ; i < exper.length(); i++)
        {
            char temp = exper.charAt(i);
            if(temp == '+' ||  temp == '*' || temp == '-')
            {
                oper = temp;
                String divide = "\\" + temp;
                String arr[] = exper.split(divide);
                first.append(arr[0]);
                num1 = new BigInteger(arr[0]);
                num2 = new BigInteger(arr[1]);
                second.append(oper).append(arr[1]);
                break;
            }
        }

        if(oper == '+')
            third.append(num1.add(num2));
        else if (oper == '-')
            third.append(num1.subtract(num2));
        else
        {
            third.append(num1.multiply(num2));
            String test = second.toString();
            int counter = 0;
            if(second.length() - 1 > 1)
            {
                middlevalues = new String[second.length() - 1];
                for(int i = test.length() - 1; i >= 1; i--)
                {
                    char temp = test.charAt(i);
                    //debug(num1.multiply(new BigInteger(Character.toString(temp))).toString());
                    middlevalues[counter++] = num1.multiply(new BigInteger(Character.toString(temp))).toString();
                }
            }
        }

        int length = Math.max(first.length(), second.length());
        length = Math.max(length, third.length());

        if(oper == '*')
        {
            int auxlength = Math.max(second.length(), (num2.compareTo(new BigInteger("9")) == 1)? middlevalues[0].length(): third.length());
            for(int i = 0 ; i < auxlength ; i++)
                firstdashes.append('-');
            auxlength = (num2.compareTo(new BigInteger("9")) == 1)? Math.max(middlevalues[middlevalues.length - 1].length(), third.length()) : 0;
            for(int i = 0 ; i < auxlength; i++)
                newdashes.append('-');

        }
        else
        {
            for(int i = 0 ; i < Math.max(second.length(), third.length()); i++)
                firstdashes.append('-');
        }


        //formatting all the inputs
        first = addspace(first, length - first.length());
        second = addspace(second, length - second.length());
        firstdashes = addspace(firstdashes, length - firstdashes.length());
        third = addspace(third, length - third.length());
        if(oper == '*' && num2.compareTo(new BigInteger("9")) == 1)
        {
            newdashes = addspace(newdashes, length - newdashes.length());
        }

        int k = 0;
        StringBuilder aux = new StringBuilder();
        for(int i = 0 ; i < middlevalues.length ;i++)
        {
            middlevalues[i] = addspace(middlevalues[i], length - middlevalues[i].length() - k);
            k++;
            if(i < middlevalues.length - 1)
                aux.append(middlevalues[i]).append('\n');
            else
                aux.append(middlevalues[i]);

        }
        StringBuilder output = new StringBuilder();
        output.append(first).append('\n').append(second).append('\n').append(firstdashes).append('\n');
        for(int i = 0 ; i < middlevalues.length ;i++)
            output.append(middlevalues[i]).append('\n');
        if(newdashes.length() > 0)
            output.append(newdashes).append('\n');
        output.append(third).append('\n');
        out.println(output);
    }
    private static StringBuilder addspace(StringBuilder arr, int len)
    {
        for(int i = 0 ; i < len ;i++)
            arr.insert(0,' ');
        return arr;
    }
    private static String addspace(String hel, int len)
    {
        for(int i = 0 ; i < len ; i++)
            hel = " " + hel;
        return hel;
    }
}
