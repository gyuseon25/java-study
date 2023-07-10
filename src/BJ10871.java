import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;
public class BJ10871 {
    public static void main(String[] args)  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String str1 = br.readLine();
            StringTokenizer st = new StringTokenizer(str1, " ");

            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            String str2 = br.readLine();
            StringTokenizer st2 = new StringTokenizer(str2, " ");
            for (int i = 0; i<n;i++){
                int a = Integer.parseInt(st2.nextToken());
                if( a < x)
                    System.out.print(a+" ");
            }
        }catch(IOException e){
            System.out.println("잘못된 입출력입니다.");
        }
    }
}
