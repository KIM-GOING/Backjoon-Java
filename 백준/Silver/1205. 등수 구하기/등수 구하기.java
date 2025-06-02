import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.ParseException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int score = Integer.parseInt(st.nextToken());
		int rankCount = Integer.parseInt(st.nextToken());
		
		if(rankCount == 0) {
			bw.write("-1");
		}else if (N > 0) {
			
			st = new StringTokenizer(br.readLine());
			int[] rankList = new int[rankCount];
			int i = 0;
			
				
			
			while (st.hasMoreTokens()) {
				rankList[i] = Integer.parseInt(st.nextToken());
				i++;
				
				if(i==rankCount) break;
				
			}
			
			if (rankList[rankList.length - 1] >= score && N>=rankCount) {
				bw.write("-1");
			}else if(rankList[0] <= score){
				bw.write("1");
			}else {
				for (int j = rankList.length - 1; j >= 0; j--) {
					if (rankList[j] > score) {
						bw.write((j+2) + "");
						break;
					}
				}
			}
		} else {	
				bw.write("1");
         
		}
		
		bw.close();
		br.close();
	}
}