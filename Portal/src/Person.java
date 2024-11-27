public class Person {
    private String ssn;
    private String name;

    public Person(String ssn, String name) {
        this.setSsn(ssn);
        this.setName(name);
    }

    public void display() {
        System.out.println("Info: ");
        System.out.println("SSN: " + this.getSsn());
        System.out.println("Name: " + this.getName());
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
