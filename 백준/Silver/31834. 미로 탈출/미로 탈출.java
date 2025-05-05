import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n, s, e;
            n = sc.nextInt();
            s = sc.nextInt();
            e = sc.nextInt();

            System.out.println(maze(n, s, e));
        }
    }

    private static int maze(int n, int s, int e) {
        // 1. 입구와 출구가 양 끝
        if((s == 1 && e == n) || (s == n && e == 1))
            return 0;

        // 2. 입구가 끝, 출구는 입구 바로 옆이 아닌 중간 위치
        if((s == 1 && (e != 2 && e != n)) || (s == n && (e != n-1 && e != 1)))
            return 1;

        // 3. 입구가 끝, 출구는 입구 옆
        if((s == 1 && e == 2) || (s == n && e == n-1))
            return 1;

        // 4. 출구가 끝, 입구는 출구 바로 옆이 아닌 중간 위치
        if((e == 1 && (s != 2 && s != n)) || (e == n && (s != n-1 && s != 1)))
            return 2;

        // 5. 출구가 끝, 입구는 출구 옆
        if((e == 1 && s == 2) || (e == n && s == n-1))
            return 1;

        // 6. 입구와 출구가 붙지 않으면서 모두 끝이 아닌
        if((s != 1 && s != n) && (e != n && e != 1) && Math.abs(e-s) != 1)
            return 2;

        // 7. 입구와 출구가 붙으면서 모두 끝이 아닌
        if((s != 1 && s != n) && (e != n && e != 1) && Math.abs(e-s) == 1)
            return 1;

        return 0;
    }
}
