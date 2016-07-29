/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.Date;

/**
 *
 * @author Labing
 */
public class FullTime extends Professor{
    
    private float salary;

    public FullTime(float salary, String School, String Department, Date HiringDate, String id, String name) {
        super(School, Department, HiringDate, id, name);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
        @Override
    public float paySalary() {
        return this.salary;
        
    }
}
