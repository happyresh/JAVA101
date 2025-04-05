import java.util.Scanner; // Import Scanner for user input

public class StudentRecordFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner object for input

        // Display input prompt
        System.out.println("------------------------------");
        System.out.println("|  Enter Student Details    |");
        System.out.println("------------------------------");

        // Taking user input
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Student ID: ");
        String studentID = scanner.nextLine();

        System.out.print("Enter Course Name: ");
        String course = scanner.nextLine();

        // Processing the data
        String fullName = formatName(firstName, lastName);
        String formattedID = formatStudentID(studentID);
        String formattedCourse = formatCourse(course);

        // Displaying the formatted student record
        displayStudentRecord(fullName, formattedID, formattedCourse);

        scanner.close(); // Close the scanner
    }

    // Method to format the full name
    public static String formatName(String first, String last) {
        return capitalize(first) + " " + capitalize(last);
    }

    // Method to format the student ID
    public static String formatStudentID(String id) {
        return "STU-" + id;
    }

    // Method to format the course name
    public static String formatCourse(String course) {
        String[] words = course.split(" ");
        StringBuilder formattedCourse = new StringBuilder();

        for (String word : words) {
            formattedCourse.append(capitalize(word)).append(" ");
        }
        return formattedCourse.toString().trim();
    }

    // Utility method to capitalize the first letter of a word
    public static String capitalize(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }

    // Method to display the student record beautifully
    public static void displayStudentRecord(String name, String id, String course) {
        System.out.println("\nSTUDENT RECORD:");
        String separator = "----------------------------";
        System.out.println(separator);
        System.out.printf("%-15s: %s%n", "Full Name", name);
        System.out.printf("%-15s: %s%n", "Student ID", id);
        System.out.printf("%-15s: %s%n", "Course", course);
        System.out.println(separator);
        System.out.println("Record Successfully Formatted!\n");
    }
}
