package datos;

import java.util.Date;

/**
 *
 * @author Labing
 */
public class Student extends Employee{
    
    protected String department;

    public Student(String department, Date HiringDate, String id, String name) {
        super(HiringDate, id, name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public float paySalary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
}
