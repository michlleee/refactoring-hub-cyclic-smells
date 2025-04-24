package solutions;

public class Student {
    private String name;
    private int studentId;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    // Method to display student info
    public void displayStudentInfo() {
        System.out.println("Student Name: " + name + ", ID: " + studentId);
    }
}
