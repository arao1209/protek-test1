package model;

public class Student extends Person{

    private static final String[] status = new String[]{"freshman","sophomore", "junior", "senior"};


    public Student(String name) {
        super(name);
    }

    @Override
    public String toString(){
        return
                "Class Name: "+getClass().getName() + " "+
                        "Person Name: "+getName();
    }


}
