package datos;

import java.util.ArrayList;

/**
 *
 * @author Labing
 */
public class UniversityStaff {

    public static void main(String[] args) {

    }

    private ArrayList<Person> payroll;

    public UniversityStaff() {
        this.payroll = new ArrayList<Person>();
    }
    
    public void addPerson(Person person){
        this.payroll.add(person);
    }

}
