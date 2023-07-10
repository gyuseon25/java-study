import java.io.*;
import java.util.StringTokenizer;

public class BJ2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] num = new int[9];
        int max = 0;
        int maxi = 0;

        for(int i = 0; i<9; i++){
            num[i] = Integer.parseInt(br.readLine());
            if(num[i]>max) {
                max = num[i];
                maxi = i + 1;
            }
        }
        bw.write(String.valueOf(max));
        bw.write("\n");
        bw.write(String.valueOf(maxi));
        bw.flush();
    }
}
