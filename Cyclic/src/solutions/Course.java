package solutions;

public class Course {
    private String courseName;
    private int courseId;

    public Course(String courseName, int courseId) {
        this.courseName = courseName;
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    // Method to display course info
    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName + ", ID: " + courseId);
    }
}
