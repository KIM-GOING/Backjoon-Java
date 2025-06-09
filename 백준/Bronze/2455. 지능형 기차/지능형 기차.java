import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0;
        int people = 0;
        for(int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int down = Integer.parseInt(st.nextToken());
            int up = Integer.parseInt(st.nextToken());

            people -= down;
            if(people > max) {
                max = people;
            }

            people += up;
            if(people > max) {
                max = people;
            }
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
    }
}