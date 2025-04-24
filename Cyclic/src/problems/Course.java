package problems;

public class Course {
    private String courseName;
    private int courseId;
    private Student student;  // Dependency on Student

    public Course(String courseName, int courseId, Student student) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.student = student;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName + ", ID: " + courseId);
        student.displayStudentInfo();
    }

    public Student getStudent() {
        return student;
    }
}
