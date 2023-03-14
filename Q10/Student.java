package Q10;

public class Student extends Person {
    private final String classStatus;
    public Student(String name, String address, String phoneNumber, String email, String classStatus) {
        super(name, address, phoneNumber, email);
        this.classStatus = classStatus;
    }
    @Override
    public String toString() {
        return "Student:\n name is "+ getName();
    }
}
