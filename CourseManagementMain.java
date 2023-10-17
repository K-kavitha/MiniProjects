package CourseManagementSystem;



import java.util.Scanner;

public class CourseManagementMain {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("Course Management System");
        System.out.println("=================================");

        CourseManagementApp app = new CourseManagementApp();

        while (true) {
            System.out.println("1. Add Course");
            System.out.println("2. Update Course");
            System.out.println("3. Delete Course");
            System.out.println("4. View All Courses");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            if (sc.hasNextInt()) {
                int choice = sc.nextInt();
                sc.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        System.out.print("Enter course code: ");
                        String code = sc.next();
                        System.out.print("Enter course name: ");
                        String name = sc.next();
                        System.out.print("Enter course credits: ");
                        
                        // Check for valid integer input
                        if (sc.hasNextInt()) {
                            int credits = sc.nextInt();
                            sc.nextLine(); // Consume the newline character
                            System.out.print("Enter course description: ");
                            String description = sc.nextLine(); // Use nextLine to read the entire line

                            Course newCourse = new Course(code, name, credits, description);
                            app.addCourse(newCourse);
                            System.out.println("Course added successfully!");
                        } else {
                            System.out.println("Invalid input for course credits. Please try again.");
                            sc.nextLine(); // Consume the invalid input
                        }
                        break;
                    case 2:
                        System.out.print("Enter course code to update: ");
                        String codeToUpdate = sc.next();
                        app.updateCourse(codeToUpdate);
                        break;
                    case 3:
                        System.out.print("Enter course code to delete: ");
                        String codeToDelete = sc.next();
                        app.deleteCourse(codeToDelete);
                        break;
                    case 4:
                        app.viewAllCourses();
                        break;
                    case 5:
                        System.out.println("Exiting Course Management System.");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.nextLine(); // Consume the invalid input
            }
        }
    }
}

