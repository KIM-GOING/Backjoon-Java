import java.io.*;
import java.util.Objects;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split("");

        int sum = 0;
        int flag = 1; // *에 대한 가중치 확인
        for(int i = 0; i < str.length; i++) {
            if(i%2 == 0) {
                if(str[i].equals("*")) continue;
                sum += Integer.parseInt(str[i]);
            } else {
                if(str[i].equals("*")) {
                    flag = 3;
                    continue;
                }
                sum += Integer.parseInt(str[i]) * 3;
            }
        }

        int result = 0;
        for(int i = 0; i < 10; i++) {
            if(((sum + flag * i) % 10) == 0) {
                result = i;
            }
        }
        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
    }
}