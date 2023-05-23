import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class BJ10988 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String str = br.readLine();
            int i = 0;
            for(int j = str.length()-1 ; j >= 0 ; j--){
                    if(str.charAt(i)!=str.charAt(j)){
                        System.out.println(0);
                        return;
                    }
                    else{
                        i++;
                    }
                    if(i >=j){
                        break;
                    }
                }
            System.out.println(1);
        } catch(IOException e){
            System.out.println("입출력 오류");
        }
    }
}
