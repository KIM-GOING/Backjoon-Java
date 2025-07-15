import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int L = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        
        int k = 0;
        int m = 0;
        
        if (A % C != 0) {
        	k = A/C+1;
        } else {
        	k = A/C;
        }
        
        if (B % D != 0) {
        	m = B/D+1;
        } else {
        	m = B/D;
        }
        
        System.out.println(k >= m ? L-k : L-m);
	}

}