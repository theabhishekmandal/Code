import java.util.*;
public class Test{
    public static void main(String[] args) {
        Random random = new Random();
        String string = "";
        StringBuilder br = new StringBuilder();
        for(int i = 0; i < 100000; i++){
            string = "";
            for(int j = 0; j < 10; j++)
                string += random.nextInt(2);
            br.append(string).append("\n");
        }
        System.out.println(br);
    }
}