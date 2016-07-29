package datos;

import java.util.Date;

/**
 *
 * @author Labing
 */
public class Grad extends Student {

    private int course;

    public Grad(int course, String department, Date HiringDate, String id, String name) {
        super(department, HiringDate, id, name);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public float paySalary() {
        if (this.course == 1) {
            return 2500000;
        } else if (this.course == 2) {
            return 2000000;
        } else {
            return 0;
        }

    }
}
