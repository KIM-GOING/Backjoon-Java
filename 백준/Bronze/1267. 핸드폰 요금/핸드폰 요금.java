import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int time, y = 0, m = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            time = Integer.parseInt(st.nextToken());
            y += ((time / 30) + 1) * 10;
            m += ((time / 60) + 1) * 15;
        }
        if (y > m) {
            System.out.println("M " + m);
        } else if (y < m) {
            System.out.println("Y " + y);
        } else {
            System.out.println("Y M " + y);
        }
    }
}