import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        double ave = 0;
        double max = 0;
        double buffer;
        int arr[] = new int[Integer.parseInt(br.readLine())];
        
        st = new StringTokenizer(br.readLine(), " ");
        do {
            buffer = Double.parseDouble(st.nextToken());
            if(max < buffer) max = buffer;
            ave += buffer;
        } while(st.hasMoreTokens());
        
        br.close();
        System.out.println(ave/arr.length/max*100);
    }
}