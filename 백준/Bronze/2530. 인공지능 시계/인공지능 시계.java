import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int sec = Integer.parseInt(st.nextToken());

        int cookSec = Integer.parseInt(br.readLine());

        // 전체 초 단위로 변환
        int totalSec = hour * 3600 + min * 60 + sec + cookSec;

        // 시, 분, 초로 다시 분해
        int resultHour = (totalSec / 3600) % 24;
        int resultMin = (totalSec % 3600) / 60;
        int resultSec = totalSec % 60;

        bw.write(String.valueOf(resultHour) + " " + String.valueOf(resultMin) + " " +String.valueOf(resultSec));
        bw.flush();
        bw.close();
    }
}