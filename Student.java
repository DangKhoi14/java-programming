class Student extends Person {
    private String major;
    private String degree;
    private Professor professor = null;
    private PlanOfStudy planOfStudy = new PlanOfStudy();

    public Student(String ssn, String name, String major, String degree) {
        super(ssn, name);
        this.setMajor(major);
        this.degree = degree;
    }

    public void attachProfessor(Professor p) {
        if (this.getProfessor() == null) {
            this.setProfessor(p);
            ;
            p.addStudent(this);
            System.out.println("Attached successfully");
        } else {
            System.out.println("Attached with " + this.professor.getName());
        }
    }

    public void addToPlanOfStudy(Course... cs) {
        this.getPlanOfStudy().addCourses(cs);
    }

    public void removeToPlanOfStudy(Course... cs) {
        this.getPlanOfStudy().removeCourse(cs);
    }

    public void displayPlanOfStudy() {
        this.getPlanOfStudy().display();
    }

    public void display() {
        super.display();
        System.out.println("Major: " + this.getMajor());
        System.out.println("Degree: " + this.getDegree());
        System.out.println("Professor: " + this.professor.getName() + "\n");
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return this.major;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDegree() {
        return this.degree;
    }

    public void setProfessor(Professor p) {
        professor = p;
    }

    public Professor getProfessor() {
        return professor;
    }

    public PlanOfStudy getPlanOfStudy() {
        return this.planOfStudy;
    }
}