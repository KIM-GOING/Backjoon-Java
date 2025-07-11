import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int[] t = new int[302];

        for (int i = 1; i <= 301; i++) {
            t[i] = t[i - 1] + i;
        }

        for (int i = 1; i <= num; i++) {
            int testcase = Integer.parseInt(br.readLine());
            int answer = 0;

            for (int j = 1; j <= testcase; j++) {
                answer += j * t[j + 1];
            }

            sb.append(answer).append("\n");
        }

        System.out.println(sb.toString());
    }
}