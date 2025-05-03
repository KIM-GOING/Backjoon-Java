import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String answer = "";

        for(int i = 0; i < n; i++) {
            String teams = sc.next();
            if(checkFunc(teams)) {
                answer = teams;
            }
        }

        System.out.println(answer);
    }

    private static boolean checkFunc(String team) {
        // 1. 대소문자 개수 비교
        int upper = 0;
        int lower = 0;
        for(int i = 0; i < team.length(); i++) {
            if(team.charAt(i) >= 65 && team.charAt(i) <= 90) {
                upper++;
            }
            if(team.charAt(i) >= 97 && team.charAt(i) <= 122) {
                lower++;
            }
        }
        if(upper > lower) {
            return false;
        }

        // 2. 문자열 길이
        if(team.length() > 10) {
            return false;
        }

        // 3. 숫자 판멸
        boolean hasNonDigit = false;
        for (int i = 0; i < team.length(); i++) {
            if (!Character.isDigit(team.charAt(i))) {
                hasNonDigit = true;
                break;
            }
        }

        return hasNonDigit;
    }
}
