import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class java_10989 {

    static int[] num = new int[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        for(int i = 0; i < cnt; i++) {
            num[Integer.parseInt(br.readLine())]++;
        }

        br.close();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 10001; i++) {
            while(num[i] > 0) {
                sb.append(i).append("\n");
                num[i]--;
            }
        }
        System.out.println(sb);
    }

}
