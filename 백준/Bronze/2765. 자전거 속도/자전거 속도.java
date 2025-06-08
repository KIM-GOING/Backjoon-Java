import java.io.*;
import java.util.*;

public class Main {

    public static double pi = 3.1415927;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = 1;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double x = Double.parseDouble(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            double z = Double.parseDouble(st.nextToken());

            if (y == 0) break;

            bw.write("Trip #" + cnt + ": " + distance(x, y) + " " + mph(x, y, z) + "\n");
            bw.flush();
            cnt++;
        }
        bw.close();
    }

    private static String distance(double x, double y) throws IOException {

        double result = (pi * x * y) / 63360;
        return String.format("%.2f", result);
    }

    private static String mph(double x, double y, double z) throws IOException {

        double result = ((pi * x * y) / 63360) / (z / 3600);
        return String.format("%.2f", result);
    }
}