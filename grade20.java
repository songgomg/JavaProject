import java.util.Scanner;

public class grade20 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your score: ");
            int score = scanner.nextInt();
            String grade;

            if (score >= 65) {
                if (score >= 70) {
                    if (score >= 75) {
                        if (score >= 80) {
                            grade = "A";
                        } else {
                            grade = "B+";
                        }
                    } else {
                        grade = "B";
                    }
                } else {
                    grade = "C+";
                }
            } else if (score >= 50) {
                if (score >= 55) {
                    if (score >= 60) {
                        grade = "C";
                    } else {
                        grade = "D+";
                    }
                } else {
                    grade = "D";
                }
            } else {
                grade = "F";
            }

            System.out.println("Your grade is: " + grade);
        }
    }
}
