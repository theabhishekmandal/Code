import static java.lang.System.*;
import java.util.*;
class Bank{
    private int id;
    private String name;
    private int openingbalance;
    Bank(int id, int openingbalance, String name){
        this.id = id;
        this.openingbalance = openingbalance;
        this.name = name;
    }
}
class Window{
    private int windowDoors;
    private boolean verticalOpen;
    Window(int windowDoors, boolean verticalOpen){
        this.windowDoors = windowDoors;
        this.verticalOpen = verticalOpen;
    }
}
class Door{
    private String DoorColor;
    private int Doorsize;
    Door(String DoorColor, int Doorsize){
        this.DoorColor = DoorColor;
        this.Doorsize = Doorsize;
    }
}
public class Main{
    static void open(Bank ob){
        out.println("your account is opened");
    }
    static void open(Window ob){
        out.println("your window is opened");
    }
    static void open(Door ob){
        out.println("your Door is opened");
    }
    public static void main(String args[]){
        Scanner s = new Scanner(in);
        open(new Door(s.next(), s.nextInt()));
        open(new Window(s.nextInt(), s.nextBoolean()));
        open(new Bank(s.nextInt(), s.nextInt(), s.next()));
    }
}