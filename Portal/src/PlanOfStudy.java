import java.util.ArrayList;
import java.util.List;

public class PlanOfStudy {
    private List<Course> courses = new ArrayList<Course>();

    public PlanOfStudy() {

    }

    public void addCourses(Course... cs) {
        for (Course c : cs) {
            boolean isViolated = false; // Reset for each course

            if (this.getCourses().contains(c)) {
                System.out.println(c.getCourseName() + " is already in plan of study");
                continue;
            }

            for (Course p : c.getPrerequisites()) {
                if (!this.getCourses().contains(p)) {
                    isViolated = true;
                    break;
                }
            }

            if (isViolated) {
                System.out.println("Violation of prerequisite subject");
                continue;
            }

            this.getCourses().add(c);
        }
    }

    public void removeCourse(Course... cs) {
        for (Course c : cs) {
            if (!canRemove(c)) {
                System.out.println("Cannot remove " + c.getCourseName()
                        + " because it is a prerequisite for other courses in the plan of study.");
                continue;
            }

            this.getCourses().remove(c);
            System.out.println(c.getCourseName() + " has been removed from the plan of study.");
        }
    }

    private boolean canRemove(Course course) {
        for (Course c : this.getCourses()) {
            if (c.getPrerequisites().contains(course)) {
                return false;
            }
        }
        return true;
    }

    public void display() {
        System.out.println("Plan of Study: ");
        if (this.getCourses() != null) {
            for (Course c : this.getCourses()) {
                System.out.println(c.getCourseNo() + "  " + c.getCourseName());
            }
        } else {
            System.out.println("No subjects have been added yet");
        }
    }

    public List<Course> getCourses() {
        return this.courses;
    }
}