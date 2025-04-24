package problems;

public class Student {
    private String name;
    private int studentId;
    private Course course;  // Dependency on Course

    public Student(String name, int studentId, Course course) {
        this.name = name;
        this.studentId = studentId;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name + ", ID: " + studentId);
        course.displayCourseInfo();
    }

    public Course getCourse() {
        return course;
    }
}