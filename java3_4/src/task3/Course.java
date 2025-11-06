package task3;
import java.io.Serializable;


public class Course implements Serializable {
    String courseCode;
    String courseName;
    String instructor;

    public Course (String courseCode, String courseName, String instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
    }
    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getInstructor() {
        return instructor;
    }
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    @Override
    public String toString() {
        return "Course{" + "courseCode=" + courseCode + ", courseName=" + courseName + ", instructor=" + instructor + '}';
    }
}
