// 정렬 부분에서 조금 더 효율적인 알고리즘을 짜려면?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class java_18110 {
    private static int n;
    private static List<Integer> opinion = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        start();
        System.out.println(solved_ac());
    }

    public static void start() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            opinion.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(opinion);
    }

    public static int solved_ac() {
        double size = opinion.size();
        int ans = (int)Math.round(size * 0.15);

        double sum = 0;
        int level = 0;
        for(int i = ans; i < opinion.size()-ans; i++) {
            sum += opinion.get(i);
            level = (int) Math.round(sum / (opinion.size() - 2 * ans));
        }

        return level;
    }
}
