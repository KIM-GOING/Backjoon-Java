import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            if(Objects.equals(name, "#") && age == 0 && weight == 0){
                break;
            }

            member(name, age, weight);
        }
        bw.close();
    }

    private static void member(String name, int age, int weight) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        if(age > 17 || weight >= 80) {
            bw.write(name + " Senior\n");
        } else {
            bw.write(name + " Junior\n");
        }
        bw.flush();
    }
}