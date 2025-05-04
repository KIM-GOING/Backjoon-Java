import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        String a = "";
        String b = "";

        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            a = a + s;
        }
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            b = b + s;
        }

        Long numA = Long.parseLong(a);
        Long numB = Long.parseLong(b);

        if(numA > numB){
            System.out.println(numB);
        } else {
            System.out.println(numA);
        }
    }
}
