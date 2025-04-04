import java.util.Stack;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class java_1874 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        List<Integer> inputArr = new ArrayList();
        List<String> outputArr = new ArrayList();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            inputArr.add(sc.nextInt());
        }

        int num = 1; // push할 숫자
        boolean possible = true;
        for (int i = 0; i < n; i++) {
            int target = inputArr.get(i);

            // target까지 push
            while (num <= target) {
                stack.push(num++);
                outputArr.add("+");
            }

            // pop 가능한지 확인
            if (stack.peek() == target) {
                stack.pop();
                outputArr.add("-");
            } else {
                possible = false;
                break;
            }
        }

        if (possible) {
            for (String s : outputArr) {
                System.out.println(s);
            }
        } else {
            System.out.println("NO");
        }

    }
}
