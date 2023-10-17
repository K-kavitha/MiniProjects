package CourseManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class CourseManagementApp {
    static Scanner sc = new Scanner(System.in);

    ArrayList<Course> courseList = new ArrayList<Course>();

    public void addCourse(Course course) {
        courseList.add(course);
    }

    public void updateCourse(String courseCode) {
        for (Course course : courseList) {
            if (course.getCourseCode().equals(courseCode)) {
                System.out.print("Enter new course name: ");
                String newName = sc.next();
                System.out.print("Enter new course credits: ");
                int newCredits = sc.nextInt();
                System.out.print("Enter new course description: ");
                String newDescription = sc.next();

                course.setCourseName(newName);
                course.setCredits(newCredits);
                course.setDescription(newDescription);

                System.out.println("Course updated successfully!");
                return;
            }
        }
        System.out.println("Course not found.");
    }

    public void deleteCourse(String courseCode) {
        for (Course course : courseList) {
            if (course.getCourseCode().equals(courseCode)) {
                courseList.remove(course);
                System.out.println("Course deleted successfully!");
                return;
            }
        }
        System.out.println("Course not found.");
    }

    public void viewAllCourses() {
        if (courseList.size() == 0) {
            System.out.println("No courses found.");
            return;
        }

        for (Course course : courseList) {
            System.out.println(course);
        }
    }
}
