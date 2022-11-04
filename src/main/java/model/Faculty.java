package model;

public class Faculty extends Employee {

    private double officeHours;
    private int rank;


    public Faculty(String name) {
        super(name);

    }

    public double getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(double officeHours) {
        this.officeHours = officeHours;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString(){
        return
                "Class Name: "+getClass().getName() + " "+
                        "Person Name: "+getName();
    }

}
