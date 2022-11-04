package model;

public class Employee extends Person{

    private String office;
    private double salary;
    private MyDate date;

    public Employee(String name){
        super(name);

    }

    public String getOffice(){
        return office;
    }

    public void setOffice(String office){
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getDate() {
        return date;
    }

    public void setDate(MyDate date) {
        this.date = date;
    }

    @Override
    public String toString(){
        return
                "Class Name: "+getClass().getName() + " "+
                "Person Name: "+getName();
    }

}
