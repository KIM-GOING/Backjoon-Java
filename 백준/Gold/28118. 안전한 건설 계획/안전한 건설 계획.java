import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 기둥 개수
        int m = sc.nextInt();  // 빔 개수

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // 빔 정보 입력
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        // 집합 개수 세기
        boolean[] visited = new boolean[n + 1];
        int componentCount = 0;

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                componentCount++;
                bfs(graph, visited, i);
            }
        }

        // 최종 비용 계산 (집합 개수 - 1)
        System.out.println(componentCount - 1);
    }

    // BFS 탐색
    static void bfs(List<List<Integer>> graph, boolean[] visited, int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int neighbor : graph.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }
}
