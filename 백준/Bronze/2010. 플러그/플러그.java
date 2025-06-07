import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            cnt += num;
        }
        int result = cnt - n + 1;
        bw.write(result + "\n");
        bw.flush();
    }
}