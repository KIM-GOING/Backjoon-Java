import java.util.Scanner;

public class java_31831 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int currentStress = 0;
        int painDays = 0;

        for (int i = 0; i < N; i++) {
            int change = sc.nextInt();

            if (change >= 0) {
                currentStress += change;
            } else {
                currentStress = Math.max(0, currentStress + change);
            }

            if (currentStress >= M) {
                painDays++;
            }
        }

        System.out.println(painDays);
    }
}