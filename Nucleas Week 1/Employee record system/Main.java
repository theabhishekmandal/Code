abstract class Employee{
    protected int id;
    String name;
    int salary;
    int rate;
    public abstract void setRate(int rate);
    public abstract int getsalary();
    public abstract void increaseRate(int perc);
}
SalaryEmployee extends Employee{
    SalaryEmployee(int id, String name){
        
    }
    public int getsalary(){
        this.salary = salary;
    }
}
public class Main{
    public static void main(String args[]){

    }
}