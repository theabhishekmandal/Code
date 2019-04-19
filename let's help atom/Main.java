import java.util.*;
import static java.lang.System.*;
public class Main{
    static class val{
        String one;
        String len;
        val(String one, String len){
            this.one = one;
            this.len = len;
        }
    }
    public static void main(String[] args) {
        try{
            Scanner s = new Scanner(in);
            int t = s.nextInt();
            s.nextLine();
            ArrayList<val> arr = new ArrayList<>();
            StringBuilder br = new StringBuilder();
            while(t-- > 0){
                String blah[] = s.nextLine().split(" ");
                if(blah[0].equals("" + '1')){
                    arr.add(new val(blah[0], blah[1].length() + ""));
                    br.append(blah[1]);
                }
                else if(blah[0].equals("" + '2')){
                    int k = Integer.parseInt(blah[1]);
                    arr.add(new val(blah[0],br.substring(br.length() - k)));
                    br.setLength(br.length() - k);
                }
                else if(blah[0].equals("" + '3')){
                    out.println(br.charAt(Integer.parseInt(blah[1]) - 1));
                }
                else if(blah[0].equals("4")){
                    if(arr.size() != 0){
                        val ob = arr.get(arr.size() - 1);
                        if(ob.one.equals("1")){
                            //err.println(ob.len);
                            br.setLength(br.length() - Integer.parseInt(ob.len));
                        }
                        else if(ob.one.equals("2")){
                            br.append(ob.len);
                        }
                        arr = new ArrayList<>(arr.subList(0, arr.size() - 1));
                    }
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}