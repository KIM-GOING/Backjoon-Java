import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        long sumA = 0;
        for (String i : a.split("")) {
            sumA += Long.parseLong(i);
        }

        long sumB = 0;
        for (String i : b.split("")) {
            sumB += Long.parseLong(i);
        }

        bw.write(String.valueOf(sumA * sumB));
        bw.flush();
        bw.close();
    }
}