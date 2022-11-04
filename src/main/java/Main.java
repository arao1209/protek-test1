import model.*;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Aneri");
        System.out.println(person.toString());

        Employee employee = new Employee("Komal");
        System.out.println(employee.toString());

        Student student = new Student("XYZ");
        System.out.println(student.toString());

        Staff staff = new Staff("PQR");
        System.out.println(staff.toString());

        Faculty faculty = new Faculty("MNO");
        System.out.println(faculty.toString());


    }

}
