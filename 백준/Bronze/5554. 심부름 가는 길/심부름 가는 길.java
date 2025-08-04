import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int totalSec = 0;

        for(int i = 0; i < 4; i++) {
            totalSec += Integer.parseInt(br.readLine());
        }

        int min, sec;

        min = totalSec / 60;
        sec = totalSec % 60;

        bw.write(String.valueOf(min));
        bw.newLine();
        bw.write(String.valueOf(sec));
        bw.flush();
        bw.close();

    }
}