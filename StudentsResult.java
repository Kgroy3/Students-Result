import java.util.Scanner;

class StudentResult {

    static char calculateGrade(double percentage) {
        if (percentage >= 90) return 'A';
        else if (percentage >= 75) return 'B';
        else if (percentage >= 60) return 'C';
        else if (percentage >= 40) return 'D';
        else return 'F';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Enter Student Name:");
            String name = sc.next();

            int total = 0;
            int subjects = 5;

            for (int i = 1; i <= subjects; i++) {
                System.out.println("Enter marks for subject " + i + ":");
                int marks = sc.nextInt();

                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid marks! Enter again.");
                    i--;
                    continue;
                }

                total += marks;
            }

            double percentage = total / 5.0;
            char grade = calculateGrade(percentage);

            System.out.println("\n----- RESULT -----");
            System.out.println("Name: " + name);
            System.out.println("Total Marks: " + total);
            System.out.println("Percentage: " + percentage);
            System.out.println("Grade: " + grade);

            System.out.println("\nAdd another student? (yes/no)");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("no")) {
                break;
            }
        }

        sc.close();
    }
}
