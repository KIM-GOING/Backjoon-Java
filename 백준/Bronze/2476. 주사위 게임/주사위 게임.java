import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] reward = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == b && b == c) {
                reward[i] = 10000 + a*1000;
            } else if (a==b || a==c) {
                reward[i] = 1000 + a*100;
            } else if (b == c) {
                reward[i] = 1000 + b*100;
            } else {
                reward[i] = Math.max(Math.max(a, b), c)*100;
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max < reward[i]) {
                max = reward[i];
            }
        }

        System.out.println(max);
    }
}