import java.util.List;

public class java_15596 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        long a = sum(arr);
        System.out.println(a);
    }

    private static long sum(int[] a) {
        long sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
