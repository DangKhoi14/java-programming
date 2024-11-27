import java.util.ArrayList;
import java.util.List;

class Course {
    private int courseNo;
    private String courseName;
    private double credits;
    private List<Course> prerequisites = new ArrayList<Course>();

    public Course(int courseNo, String courseName, double credits) {
        this.setCourseNo(courseNo);
        this.setCourseName(courseName);
        this.setCredits(credits);
    }

    public void addPrerequisites(Course... cs) {
        for (Course c : cs) {
            if (this == c) {
                System.out.println("Invalid: A course cannot be a prerequisite of itself.");
                continue;
            }

            if (this.getPrerequisites().contains(c)) {
                System.out.println(c.getCourseName() + " is already a prerequisite.");
                continue;
            }

            if (c.getPrerequisites().contains(this)) {
                System.out.println(this.getCourseName() + " is a prerequisite of " + c.getCourseName());
                continue;
            }

            this.getPrerequisites().add(c);
        }
    }

    public void removePrerequisites(Course... cs) {
        for (Course c : cs) {
            if (this == c) {
                System.out.println("Invalid: A course cannot remove itself as a prerequisite.");
                continue;
            }

            if (!this.getPrerequisites().contains(c)) {
                System.out.println(c.getCourseName() + " is not a prerequisite of " + this.getCourseName());
                continue;
            }

            // remove method don't need to check containing before removing
            this.getPrerequisites().remove(c);
        }
    }

    public void display() {
        System.out.println("<====================>");
        System.out.println("No: " + this.getCourseNo());
        System.out.println("Name: " + this.getCourseName());
        System.out.println("Credits: " + this.getCredits());

        displayPrerequisites();
    }

    public void displayPrerequisites() {
        System.out.println("Prerequisites: ");

        for (Course c : this.getPrerequisites()) {
            System.out.println(c.getCourseName());
        }
    }

    public void setCourseNo(int courseNo) {
        this.courseNo = courseNo;
    }

    public int getCourseNo() {
        return this.courseNo;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public double getCredits() {
        return this.credits;
    }

    public List<Course> getPrerequisites() {
        return this.prerequisites;
    }
}