// 브루트포스 알고리즘으로 해결함.
// 조금 더 효율적인 알고리즘을 고민해보자.

import java.util.Scanner;

public class java_1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 1;
        int num = 666;

        while(n != cnt) {
            num++;

            if(Integer.toString(num).contains("666")) {
                cnt++;
            }
        }

        System.out.println(num);
    }
}
