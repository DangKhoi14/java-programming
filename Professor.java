import java.util.ArrayList;
import java.util.List;

class Professor extends Person {
    private String title;
    private List<Student> students = new ArrayList<Student>();

    public Professor(String ssn, String name, String title) {
        super(ssn, name);
        this.setTitle(title);
    }

    public void addStudent(Student... students) {
        for (Student s : students) {
            if (s.getProfessor() == null) {
                this.getStudents().add(s);
                s.setProfessor(this);
            } else {
                System.out.println(s.getName() + " has attachive professor");
            }
        }
    }

    public void removeStudent(Student s) {
        if (s.getProfessor() == this) {
            // remove method don't need to check containing before removing
            this.getStudents().remove(s);
        } else if (s.getProfessor() != null) {
            System.out.println("Student has another attachive professor");
        } else {
            System.out.println("Student don't have attachive professor");
        }
    }

    public void display() {
        System.out.println("<====================>");
        super.display();
        System.out.println("Title: " + this.getTitle());
        System.out.println("List of students:");

        if (students.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (Student s : students) {
                s.getName();
            }
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public List<Student> getStudents() {
        return this.students;
    }
}
