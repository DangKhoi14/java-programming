public class portal {
    public static void main(String[] args) throws Exception {
        Course fb = new Course(0, "fb", 0);
        Course dsa = new Course(1, "dsa", 0);
        Course oop = new Course(2, "oop", 0);

        dsa.addPrerequisites(fb);
        oop.addPrerequisites(fb, dsa);

        Student s1 = new Student("001", "Student one", "CS", "Bachelor");
        
        s1.addToPlanOfStudy(dsa);
        s1.addToPlanOfStudy(fb, dsa, oop);

        s1.getPlanOfStudy().display();
    }
}
