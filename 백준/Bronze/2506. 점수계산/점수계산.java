import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] result = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        result[0] = arr[0];

        for (int i = 1; i < n; i++) {
            if(arr[i] == 1) {
                if(arr[i-1] == 0) {
                    result[i] = 1;
                }
                else {
                    result[i] = result[i-1] + 1;
                }
             }
        }

        int total = 0;
        for(int i: result) {
            total += i;
        }

        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
    }
}