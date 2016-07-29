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
public abstract class Employee extends Person {

    protected Date HiringDate;

    public Employee(Date HiringDate, String id, String name) {
        super(id, name);
        this.HiringDate = HiringDate;
    }

    public Date getHiringDate() {
        return HiringDate;
    }

    public void setHiringDate(Date HiringDate) {
        this.HiringDate = HiringDate;
    }

    public abstract float paySalary();

}
