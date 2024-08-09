import java.util.Scanner;

/**
 * grade1
 */
public class grade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("กรุณาใส่ค่าเลข 0-100: ");
        int score = scanner.nextInt();
        String grade = "";

        if (score >= 80) {
            grade = "A";
        } else if (score >= 75) {
            grade = "B+";
        } else if (score >= 70) {
            grade = "B";
        } else if (score >= 65 ) {
            grade = "C+";
        } else if (score >= 60 ) {
            grade = "C";
        } else if (score >= 55) {
            grade = "D+";
        } else if (score >= 50 ) {
            grade = "D";
        } else if (score >= 0) {
            grade = "E";
        } else {
            System.out.println("ค่าไม่ถูกต้อง");
            return;
        }

        System.out.println("เกรดที่ได้คือ: " + grade);
    }
}