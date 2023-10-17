package CourseManagementSystem;

public class Course {
    private String courseCode;
    private String courseName;
    private int credits;
    private String description;

    public Course() {
        super();
    }

    public Course(String courseCode, String courseName, int credits, String description) {
        super();
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.description = description;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Course [courseCode=" + courseCode + ", courseName=" + courseName + ", credits=" + credits
                + ", description=" + description + "]";
    }
}
