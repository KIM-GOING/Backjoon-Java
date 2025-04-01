import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class java_10989 {

    static int totalNum;
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> nums = new ArrayList<Integer>();

    public static void main(String[] args) {
        totalNum = sc.nextInt();

        inputNums();
        sortNums();
        printNums();
    }

    public static void inputNums() {
        for(int i = 0; i < totalNum; i++){
            nums.add(sc.nextInt());
        }
    }

    public static void sortNums() {
        Collections.sort(nums);
    }

    public static void printNums() {
        for(int i = 0; i < totalNum; i++){
            System.out.println(nums.get(i));
        }
    }
}
