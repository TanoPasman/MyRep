package datos;

import java.util.Date;

/**
 *
 * @author Labing
 */
public class Professor extends Employee {

    protected String School;
    protected String Department;

    public Professor(String School, String Department, Date HiringDate, String id, String name) {
        super(HiringDate, id, name);
        this.School = School;
        this.Department = Department;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String School) {
        this.School = School;
    }
    
    
    @Override
    public float paySalary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
