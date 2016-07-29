package datos;

import java.util.Date;

/**
 *
 * @author Labing
 */
public class Undergrad extends Student {

    private int weekHours;

    public Undergrad(int weekHours, String department, Date HiringDate, String id, String name) {
        super(department, HiringDate, id, name);
        this.weekHours = weekHours;
    }

    public int getWeekHours() {
        return weekHours;
    }

    public void setWeekHours(int weekHours) {
        this.weekHours = weekHours;
    }

    @Override
    public float paySalary() {

        if (this.weekHours == 6) {
            return (668700 / 3);
        } else if (this.weekHours == 12) {
            return (2 * 668700 / 3);
        } else {
            return 0;
        }

    }
}