import java.util.*;
public class Main{
    public static void main(String[] args) {
       try{
        System.out.println("Opening notepad");
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("cmd /c start cmd.exe /K \"dir && ping localhost\"");
        try{
            Thread.sleep(5000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("closing notepad");
        process.destroy();
       } 
       catch(Exception e){
           e.printStackTrace();
       }
    }
}