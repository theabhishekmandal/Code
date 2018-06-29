import static java.lang.System.*;

import java.util.Scanner;
class vehicle{
    private int noOfWheel;
    private int noOfPassenger;
    private int model;
    private String make;

    vehicle(int noOfWheels, int noOfPassengers, int model, String make){
        this.noOfWheel = noOfWheels;
        this.noOfPassenger = noOfPassengers;
        this.model = model;
        this.make = make;
    }
    public String getwheel(){
        return "Number of wheels are " + noOfWheel;
    }
    public String getpassenger(){
        return "Number of Passengers are " + noOfPassenger;
    }
    public String getmodel(){
        return "Model of the vehicle" + model;
    }
    public String getmake(){
        return "Make of the vehicle " + make;
    }
    public void display(){
        out.println(getwheel());
        out.println(getpassenger());
        out.println(getmodel());
        out.println(getmake());
    }
    
}
class car extends vehicle{
    private int noOfdoors;
    car(int noOfWheels, int noOfPassengers, int model, int noOfDoors, String make){
        super(noOfWheels, noOfPassengers, model, make);
        this.noOfdoors = noOfDoors;
    }
    public String getdoors(){
        return "No. of doors are " + this.noOfdoors;
    }
    @Override
    public void display(){
        out.println(getmake());
        out.println(getmodel());
        out.println(getdoors());
    }
}
class Convertible extends car{
    private boolean isHoodOpen;
    Convertible(int noOfWheels, int noOfPassengers, int model, int noOfDoors, boolean isHoodOpen, String make){
        super(noOfWheels, noOfPassengers, model, noOfDoors, make);
        this.isHoodOpen = isHoodOpen;
    }
    public String getisHoodOpen(){
        String open = (isHoodOpen) ? "open" : "not open";
        return "The hood is " + open;
    }
    @Override
    public void display(){
        super.display();
        out.println(getisHoodOpen());
    }
}
class SportsCar extends car{
    SportsCar(int noOfWheels, int noOfPassengers, int model, String make){
        super(noOfWheels, noOfPassengers, model, 2, make);
    }
    @Override
    public void display(){
        super.display();
    }
}
class application{
    public static void main(String[] args) {
        Scanner s = new Scanner(in);
        int k = 4;
        while(k-- > 0){
        //out.println("enter Your choice from 1 - 2");
        int test = s.nextInt();
        int noOfWheels, noOfPassengers, model, noOfDoors;
        boolean isHoodOpen;
        String make;
        switch(test){
            case 1://out.println("enter no. of wheel, no. of Passenger, model number, no. of  doors and maker");
                    noOfWheels = s.nextInt();
                    noOfPassengers = s.nextInt();
                    model = s.nextInt();
                    make = s.next();
                    vehicle ob = new vehicle(noOfWheels, noOfPassengers, model, make); 
                    ob.display();
                    out.println();
                    break;
            case 2://out.println("enter no. of wheel, no. of Passenger, model number, no. of doors  and maker");
                    noOfWheels = s.nextInt();
                    noOfPassengers = s.nextInt();
                    model = s.nextInt();
                    noOfDoors = s.nextInt();
                    make = s.next();
                    car ob1 = new car(noOfWheels, noOfPassengers, model, noOfDoors, make); 
                    ob1.display();
                    out.println();
                    break;
            case 3://out.println("enter no. of wheel, no. of Passenger, model number, no. of doors, is hood open and maker");
                    noOfWheels = s.nextInt();
                    noOfPassengers = s.nextInt();
                    model = s.nextInt();
                    noOfDoors = s.nextInt();
                    isHoodOpen = s.nextBoolean();
                    make = s.next();
                    Convertible ob2 = new Convertible(noOfWheels, noOfPassengers, model, noOfDoors, isHoodOpen, make); 
                    ob2.display();
                    out.println();
                    break;
            case 4:
                    //out.println("enter no. of wheel, no. of Passenger, model number and maker");
                    noOfWheels = s.nextInt();
                    noOfPassengers = s.nextInt();
                    model = s.nextInt();
                    make = s.next();
                    SportsCar ob3 = new SportsCar(noOfWheels, noOfPassengers, model, make);
                    ob3.display();
                    out.println();
                    break;
            default: err.println("Wrong Input");
        }
    }
}
}