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
public class ByContract extends Employee{
    
    private int months;
    private float value;

    public ByContract(int months, float value, Date HiringDate, String id, String name) {
        super(HiringDate, id, name);
        this.months = months;
        this.value = value;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public float paySalary() {
        
        return (this.value / this.months);
    }
    
    
}
