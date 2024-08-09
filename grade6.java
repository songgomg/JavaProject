import java.util.Scanner;

public class grade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("กรุณาใส่ค่าคะแนน (0-100): ");
        int score = scanner.nextInt();

        if (score <= 100 && score >= 0) {
            if (score >= 80) {
                System.out.println("เกรด: A");
            } else {
                if (score >= 75) {
                    System.out.println("เกรด: B+");
                } else {
                    if (score >= 70) {
                        System.out.println("เกรด: B");
                    } else {
                        if (score >= 65) {
                            System.out.println("เกรด: C+");
                        } else {
                            if (score >= 60) {
                                System.out.println("เกรด: C");
                            } else {
                                if (score >= 55) {
                                    System.out.println("เกรด: D+");
                                } else {
                                    if (score >= 50) {
                                        System.out.println("เกรด: D");
                                    } else {
                                        System.out.println("เกรด: E");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("คะแนนไม่ถูกต้อง");
        }

        scanner.close();
    }
}
