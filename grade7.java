import java.util.Scanner;

public class grade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("กรุณาใส่ค่าคะแนน (0-100): ");
        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("คะแนนไม่ถูกต้อง");
        } else {
            int gradeNumber = 100 - score;
            if (gradeNumber < 20) {
                System.out.println("เกรด: A");
            } else if (gradeNumber < 25) {
                System.out.println("เกรด: B+");
            } else if (gradeNumber < 30) {
                System.out.println("เกรด: B");
            } else if (gradeNumber < 35) {
                System.out.println("เกรด: C+");
            } else if (gradeNumber < 40) {
                System.out.println("เกรด: C");
            } else if (gradeNumber < 45) {
                System.out.println("เกรด: D+");
            } else if (gradeNumber < 50) {
                System.out.println("เกรด: D");
            } else {
                System.out.println("เกรด: E");
            }
        }

        scanner.close();

    }
}
