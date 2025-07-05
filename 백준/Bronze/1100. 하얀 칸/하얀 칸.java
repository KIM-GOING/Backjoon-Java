import java.io.*;
import java.util.Objects;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int total = 0;

        for(int i = 0; i < 8; i++) {
            String line = br.readLine();
            String[] chess = line.split("");
            for(int j = 0; j < 8; j++) {
                if(i % 2 == 0 && j % 2 == 0 && chess[j].equals("F"))
                    total++;
                if(i % 2 == 1 && j % 2 == 1 && chess[j].equals("F"))
                    total++;
            }
        }

        bw.write(Integer.toString(total));
        bw.flush();
        bw.close();
    }
}