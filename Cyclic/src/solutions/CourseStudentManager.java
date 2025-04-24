package solutions;

public class CourseStudentManager {
    private Course course;
    private Student student;

    public CourseStudentManager(Course course, Student student) {
        this.course = course;
        this.student = student;
    }

    public void displayCourseAndStudentInfo() {
        course.displayCourseInfo();  // calls the display function
        student.displayStudentInfo();
    }
}